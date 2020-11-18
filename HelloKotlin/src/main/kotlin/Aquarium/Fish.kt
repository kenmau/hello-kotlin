package Aquarium

// This creates a primary constructor with 2 arguments
class Fish(val friendly: Boolean = true, volumeNeeded: Int) {

    val size: Int

    // Secondary Constructor must call the primary constructor, this().
    // This secondary constructor as no arguments
    constructor() : this(true, 9) {
        println("Secondary Constructor")
    }

    // These run before any secondary constructor.
    // They become part of the primary constructor
    init {
        println("first init block")
    }

    // Execution at object creation time
    init {
        size = if (friendly) {
            volumeNeeded
        } else {
            volumeNeeded * 2
        }
    }

    init {
        println("constructed fish of size $volumeNeeded with size ${this.size}")
    }
}

// Helper Classes. Keep classes simple, clean API
fun makeDefaultFish() = Fish(true, 50)

fun fishExample() {
    val fish = Fish(true, 20)
    println("Is the fish friendly? ${fish.friendly}. It needs ${fish.size}")
}