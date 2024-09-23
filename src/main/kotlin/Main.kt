abstract class Animal(private var nombre: String) {
    fun getNombre(): String {
        return nombre
    }
    fun setNombre(nuevoNombre: String) {
        nombre = nuevoNombre
    }
    abstract fun hacerSonido(): String
}


class Perro(nombre: String, private val raza: String) : Animal(nombre) {

    override fun hacerSonido(): String {
        return "Guau guau"
    }

    fun obtenerRaza(): String {
        return raza
    }
}
fun main() {

    val miPerro = Perro("Firulais", "Labrador")
    println("El nombre de mi perro es: ${miPerro.getNombre()}")
    miPerro.setNombre("Rex")
    println("Ahora el nombre de mi perro es: ${miPerro.getNombre()}")
    println("Mi perro hace: ${miPerro.hacerSonido()}")
    println("La raza de mi perro es: ${miPerro.obtenerRaza()}")
}
