package Aquarium.generics

// Lesson 5.10
// open so that We can subclass from it.
open class WaterSupply(var needsProcessed: Boolean)

class TapWater : WaterSupply(true) {
    fun addChemicalCleaners() {
        needsProcessed = false
    }
}

class FishStoreWater : WaterSupply(false)

class LakeWater : WaterSupply(true) {
    fun filter() {
        needsProcessed = false
    }
}

// Generic Class. Type T. Upperbound WaterSupply
class Aquarium<T: WaterSupply>(val waterSupply: T) {
    fun addWater() {
        check(!waterSupply.needsProcessed) { "water supply needs processed" }
        println("adding water from $waterSupply")
    }
}

fun main() {
    genericExample()
}

fun genericExample() {
    val aquarium = Aquarium<TapWater>(TapWater())
    // Also works:
    // val aquarium = Aquarium(TapWater())
    aquarium.waterSupply.addChemicalCleaners()

    val aquarium2 = Aquarium(LakeWater())
    aquarium2.waterSupply.filter()
    aquarium2.addWater()
}