package com.example.tiendaspaginas3

data class Categoria(var title:String)
data class Deporte(var title:String)
data class Joyeria(var title:String)
data class Hogar(var title:String)
data class Accesorio(var title:String)
data class Ropa(var title:String)
data class Jugueteria(var title:String)

object Categories {
    val categorias = listOf<Categoria>(
        Categoria("Deportes"),
        Categoria("Joyerias"),
        Categoria("Hogar"),
        Categoria("Accesorios"),
        Categoria("Ropa"),
        Categoria("Jugueterias")
    )
object Deportes {
        val deportes = listOf<Deporte>(
            Deporte("Nike"),
            Deporte("Adidas"),
            Deporte("Marti"),
            Deporte("Puma"),
            Deporte("Rebook")
        )
    }
    object Joyeraias {
        val joyerias = listOf<Joyeria>(
            Joyeria("Gucci"),
            Joyeria("Graff"),
            Joyeria("Bvlgari"),
            Joyeria("Cristal")
        )
    }
    object Hogares {
        val hogar = listOf<Hogar>(
            Hogar("Home Deppot"),
            Hogar("Walmart"),
            Hogar("Linio"),
            Hogar("Liverpool")
        )
    }

    object Accesorios {
        val accesorios = listOf<Accesorio>(
            Accesorio("Steren"),
            Accesorio("AliExpress"),
            Accesorio("Amazon"),
            Accesorio("Ebay"),
            Accesorio("Mercado Libre")
        )
    }
    object Ropas {
        val ropas = listOf<Ropa>(
            Ropa("Bershka"),
            Ropa("Pull&Bear"),
            Ropa("ZARA"),
            Ropa("Stradivarius"),
            Ropa("FOREVER 21")
        )
    }
    object Jugueterias {
        val jugueterias = listOf<Jugueteria>(
            Jugueteria("Lego"),
            Jugueteria("Hasbro"),
            Jugueteria("Mattel"),
            Jugueteria("Mi Alegria")
            )
    }

}