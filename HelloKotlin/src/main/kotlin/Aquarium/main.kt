package Aquarium

fun main (args: Array<String>) {
    buildAquarium()
}

fun buildAquarium() {
    val myAquarium = Aquarium()

    // Getters are created automatically
    println("Length: ${myAquarium.length} " +
            "Width: ${myAquarium.width} " +
            "Height: ${myAquarium.height}")
}