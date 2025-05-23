# 📱 Kotlin App - Platzi Fake Store

Este es un proyecto de consumo de API desarrollado en **Kotlin** que utiliza la **Platzi Fake Store API**.  
La aplicación está construida siguiendo buenas prácticas de arquitectura y desarrollo Android moderno.

---

## ✅ Características principales

- 📦 **Listado de productos** con:
  - Imagen, nombre y precio.
  - Búsqueda por nombre.
  - Ordenamiento por precio.
- 🔍 **Detalle del producto** al hacer clic en un ítem.
- 💾 **Persistencia local** con Room.

---

## 🔧 Estructura del proyecto

- `MainActivity`: Contenedor principal (Single Activity).
- `ProductListFragment`: Lista de productos.
- `ProductDetailFragment`: Vista de detalle.
- `ProductViewModel`: Lógica de presentación.
- `ProductRepository`: Fuente de datos API + local.
- `ProductDao`, `ProductEntity`: Implementación de Room.

---

## 🗃️ API utilizada

- **Base URL:** [`https://api.escuelajs.co/api/v1/product`](https://api.escuelajs.co/api/v1/product)  
- **Documentación oficial:** Platzi Fake Store API

---

💡 
![WhatsApp Image 2025-05-23 at 09 17 47](https://github.com/user-attachments/assets/6b3cdbcc-0b19-416b-99cd-33a8e7598629)
