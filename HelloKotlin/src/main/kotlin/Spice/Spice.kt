package Spice

class Spice(val name: String, val spiciness: String = "mild") {
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
}

fun makeSalt() = Spice ("salt", "less than spicy")

