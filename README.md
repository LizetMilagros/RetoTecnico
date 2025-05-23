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
## 🖼️ proyecto en ejecucion

<table>
  <tr>
    <td align="center">
      <img src="https://github.com/user-attachments/assets/6b3cdbcc-0b19-416b-99cd-33a8e7598629" width="200" />
    </td>
    <td align="center">
      <img src="https://github.com/user-attachments/assets/7b9e7e1b-7f5e-4f2f-876c-41d17b7720a1" width="200" />
    </td>
  </tr>
  <tr>
    <td align="center">
      <img src="https://github.com/user-attachments/assets/608fdb92-c7ab-412c-acad-d4c15c500fb1" width="200" />
    </td>
    <td align="center">
      <img src="https://github.com/user-attachments/assets/495ab209-b8bb-40b0-af14-cdb5ab12f29f" width="200" />
    </td>
  </tr>
</table>



