package Aquarium

// Abstract classes can have constructors
// Need to have subclasses to be able to instantiate

// Use when can't complete a class
abstract class AquariumFish {
    abstract val color: String
}

class Shark() : AquariumFish(), FishAction {
    override val color: String = "grey"
    val a = "a"

    override fun eat() {
        println("hunt and eat fish")
    }
}

//class Plecostomus: AquariumFish(), FishAction {
//    override val color: String = "gold"
//    val b = "b"
//
//    override fun eat() {
//        println("munch on algae")
//    }
//}


// Interfaces don't have constructors
// Default implementations: Can contain implementations of functions

// Use if have a lot of methods, and 1 or 2 default implementation
interface FishAction {
    fun eat()
}


// Interface Delegation: Add features to class using Composition
// Composition: Use an instance of another class instead of inheriting from it.

interface FishColor {
    val color: String
}

// Implement FishColor by deferring all calls to GoldColor
class Plecostomus(fishColor: FishColor = GoldColor):
        FishAction by PrintingFishAction("algae"),
        FishColor by fishColor

// Only have 1 instance of a class. Use object.
// Singleton
object GoldColor: FishColor {
    override val color = "gold"
}

object RedColor: FishColor {
    override val color = "red"
}

class PrintingFishAction(val food: String): FishAction {
    override fun eat() {
        println(food)
    }
}