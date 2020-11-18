package Spice

fun main() {
    val spice = SimpleSpice()

    println("Spice is named: ${spice.name}")
    println("Spice is level: ${spice.heat}")

    val spiceList = listOf<Spice>(
            Spice("a"),
            Spice("b", "less than spicy"),
            Spice("c", spiciness = "spicy"),
            Spice("d", spiciness = "spicy")
    )

    val spicyList = spiceList.filter { it.heat > 5 }
    print("Spicy List: ")

    // These are 3 ways which a list can be iterated through:
    //    (0 until someList.size).forEach { print(someList[it]) }
    //    someList.forEach { print(it) }
    //    someList.forEach(::print)

    spicyList.forEach { print("${it.name} ") }
    println()

    val salt = makeSalt()
}