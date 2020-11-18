package Aquarium

import kotlin.math.PI

// Everything is public by default

// Create member properties inline for the constructor
// Kotlin will create constructor automatically

// Need to make class open to make this class sub-classable
open class Aquarium(var length: Int = 100, var width: Int = 20, var height: Int = 40) {

    // Variables also need to be declared open
    open var volume: Int
        get() = width * height * length / 1000
        set(value) {
            height = (value * 1000) / (width * length)
        }

    // fun volume() = width * height * length / 1000

    open var water = volume * 0.9

    // call to default constructor this()
    constructor(numberOfFish: Int) : this() {
        val water: Int = numberOfFish * 2000 //cm3
        val tank: Double = water + water * 0.1
        height = (tank / (length * width)).toInt()

    }
}

class TowerTank() : Aquarium() {
    override var water = volume * 0.8

    override var volume: Int
        get() = ((width * height * length / 1000) * PI).toInt()
        set(value) {
            height = (value * 1000)/(width * length)
        }

}