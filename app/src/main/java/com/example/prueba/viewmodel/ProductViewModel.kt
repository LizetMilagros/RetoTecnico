package com.example.prueba.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.prueba.model.Product
import com.example.prueba.repository.ProductRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.*
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class ProductViewModel @Inject constructor(
    private val repository: ProductRepository
) : ViewModel() {

    private val _searchQuery = MutableStateFlow("")
    val searchQuery: StateFlow<String> = _searchQuery

    private val _sortAscending = MutableStateFlow(true)
    val sortAscending: StateFlow<Boolean> = _sortAscending

    val products: StateFlow<List<Product>> = combine(
        repository.allProducts,
        _searchQuery,
        _sortAscending
    ) { productList, query, ascending ->
        val filtered = productList.filter {
            it.title.contains(query, ignoreCase = true)
        }
        if (ascending) filtered.sortedBy { it.price }
        else filtered.sortedByDescending { it.price }
    }.stateIn(viewModelScope, SharingStarted.WhileSubscribed(5000), emptyList())

    fun setSearchQuery(query: String) {
        _searchQuery.value = query
    }

    fun toggleSortOrder() {
        _sortAscending.value = !_sortAscending.value
    }

    fun getProductById(id: Int): Flow<Product?> {
        return repository.getProductById(id)
    }

    init {
        viewModelScope.launch {
            try {
                repository.refreshProducts()
            } catch (e: Exception) {
                println("Error al cargar productos desde la API: ${e.message}")
            }
            repository.refreshProducts()
        }
    }
}
