package Aquarium

fun main (args: Array<String>) {
    buildAquarium()
}

// public - everywhere
// private - file scope; subclasses cannot see
// internal - module scope, anywhere inside project.
// protected - subclasses can see

fun buildAquarium() {
    val myAquarium = Aquarium()

    // Getters are created automatically
    println("Length: ${myAquarium.length} " +
            "Width: ${myAquarium.width} " +
            "Height: ${myAquarium.height}")

    myAquarium.height = 50

    println("Volume: ${myAquarium.volume}")

    val smallAquarium = Aquarium(20, 15, 30)
    println("Small Aquarium: ${smallAquarium.volume}")

    val myAquarium2 = Aquarium(numberOfFish = 9)
    println("Small Aquarium 2: ${myAquarium2.volume}")

    val defaultFish = makeDefaultFish()
    println("defaultFish is friendly: ${defaultFish.friendly}. Size is ${defaultFish.size}")

    val fish = Fish(volumeNeeded = 30)
    println("fish is friendly: ${fish.friendly}. Size is ${fish.size}")

    val anotherFish = Fish(false, volumeNeeded = 30)
    println("fish is friendly: ${anotherFish.friendly}. Size is ${anotherFish.size}")

    // This will call the secondary constructor
    val superFish = Fish()
    println("fish is friendly: ${superFish.friendly}. Size is ${superFish.size}")
}