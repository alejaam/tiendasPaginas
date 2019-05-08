package com.example.tiendaspaginas3

data class Categoria(var title:String)
data class Deporte(var title:String)
object Supplier {
    val categorias = listOf<Categoria>(
        Categoria("Deportes"),
        Categoria("Joyerias"),
        Categoria("Bebes"),
        Categoria("Montañismo"),
        Categoria("Hogar"),
        Categoria("Electronicos"),
        Categoria("Accesorios"),
        Categoria("Ropa"),
        Categoria("Deportes"),
        Categoria("Joyerias"),
        Categoria("Bebes"),
        Categoria("Montañismo"),
        Categoria("Hogar"),
        Categoria("Electronicos"),
        Categoria("Accesorios"),
        Categoria("Ropa")
    )
object SupplierTwo {
        val deportes = listOf<Deporte>(
            Deporte("Nike"),
            Deporte("Adidas"),
            Deporte("Marti"),
            Deporte("Puma"),
            Deporte("Rebook")
        )
    }
}