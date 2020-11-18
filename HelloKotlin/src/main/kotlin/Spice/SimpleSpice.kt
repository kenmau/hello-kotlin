package Spice

class SimpleSpice {
    val name: String = "curry"
    val spiciness: String = "mild"
    val heat: Int
        get() {
            if (spiciness == "mild") return 5

            return 0
        }
}