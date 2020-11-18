package Aquarium

// Everything is public by default

// Create member properties inline for the constructor
// Kotlin will create constructor automatically
class Aquarium (var length: Int = 100, var width: Int = 20, var height: Int = 40) {


    var volume: Int = 0
        get() = width * height * length / 1000
        // set(value) {}

    // fun volume() = width * height * length / 1000

    // call to default constructor this()
    constructor(numberOfFish: Int): this() {
        val water: Int = numberOfFish * 2000 //cm3
        val tank: Double = water + water * 0.1
        height = (tank / (length * width)).toInt()

    }
}