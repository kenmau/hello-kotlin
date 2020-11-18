package Spices

import Aquarium.Color

// Lesson 4.10
abstract sealed class Spice(val name: String, val spiciness: String = "mild", color: SpiceColor) : SpiceColor by color {
    var heat: Int = 0
        get() {
            return when (spiciness) {
                "mild" -> 5
                "spicy" -> 7
                "less than spicy" -> 3
                else -> 0
            }
        }

    init {
        println("Spice Created: $name with heat $heat")
    }

    abstract fun prepareSpice()
}

class Curry(name: String, spiceLevel: String,  color: SpiceColor = YellowSpiceColor):
        Spice(name, spiceLevel, color),
        Grinder {

    override fun prepareSpice() {
        grind()
    }

    override fun grind() {
        TODO("Not yet implemented")
    }
}

interface Grinder {
    fun grind()
}

interface SpiceColor {
    var color: Color
}

object YellowSpiceColor: SpiceColor {
    override var color = Color.YELLOW
}

fun main() {
    val curry = Curry(name = "some curry", spiceLevel = "spicy")
    println("curry is ${curry.color} color")

    // Lesson 4.12
    val spiceContainer1 = SpiceContainer(Curry(name="Yellow Curry","mild"))
    val spiceContainer2 = SpiceContainer(Curry(name="Red Curry","spicy"))
    val spiceContainer3 = SpiceContainer(Curry(name="Green Curry","less than spicy"))
    val spiceCabinet = listOf(spiceContainer1, spiceContainer2, spiceContainer3)

    spiceCabinet.forEach { println(it.label) }
}