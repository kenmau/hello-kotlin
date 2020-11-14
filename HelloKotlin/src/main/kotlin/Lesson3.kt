import java.lang.Math.random
import java.util.*

//fun main(args : Array<String>) {
//    // Lesson 3.3
//    println (dayOfWeek())
//
//    // Lesson 3.4
//    println ("This is the first argument: ${args[0]}")
//    println ("Expressions can be evaluated inside curly braces like this: ${ if (dayOfWeek() == "Tuesday to Saturday") "almost Friday!" else "aww" }.")
//
//    // Lesson 3.5
//    val time : String = args[1]
//    val timeInInt : Int = time.toInt()
//
//    println ( when (timeInInt) {
//            in 0..11 -> "Good morning, Kotlin"
//            else -> "Good night, Kotlin"
//        }
//    )
//
//    println("How do I feel?: ${whatShouldIDoToday(readLine()!!)}")
//
//
//
//    println ( "${if (timeInInt < 12) "Good morning, Kotlin" else "Good night, Kotlin"}")
//
//    feedTheFish()
//
//    swim(speed = "slow")
//
//    println(canAddFish(10.0, listOf(3,3,3)))
//    println(canAddFish(8.0, listOf(2,2,2), hasDecorations = false))
//    println(canAddFish(9.0, listOf(1,1,3), 3))
//    println(canAddFish(10.0, listOf(), 7, true))
//}

// Lesson 3.3
fun printHello() {
    println("Hello World!")
}

fun dayOfWeek() : String {
    println("What day is it today?")
    val dayOfWeek = Calendar.getInstance().get(Calendar.DAY_OF_WEEK)

    return (when (dayOfWeek) {
        1 -> "Sunday"
        2 -> "Monday"
        else -> "Tuesday to Saturday"
    })
}

// Lesson 3.6
fun feedTheFish() {
    val day = randomDay()
    val food = fishFood(day)

    println ("Today is $day and the fish eat $food")
}

fun randomDay() : String {
    val week = listOf ("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday")

    return week[Random().nextInt(7)]
}

// Lesson 3.7
//fun main() {
//    var fortune: String = ""
//    while (!fortune.contains("Take it easy")) {
//        fortune = getFortuneCookie(getBirthday())
//        println ("Your fortune is: $fortune")
//    }
//}

fun getBirthday() : Int {
    print ("Enter your birthday: ")
    return readLine()?.toIntOrNull() ?: 1
}

fun getFortuneCookie(birthday : Int) : String {
    val fortunes = listOf(
            "You will have a great day!",
            "Things will go well for you today.",
            "Enjoy a wonderful day of success.",
            "Be humble and all will turn out well.",
            "Today is a good day for exercising restraint.",
            "Take it easy and enjoy life!",
            "Treasure your friends because they are your greatest fortune."
    )

    val index = when (birthday) {
        in 1..7 -> 4
        28, 31 -> 2
        else -> birthday % fortunes.size
    }

    return fortunes[index]
}

// Lesson 3.8
fun fishFood(day : String) : String {
    return when (day) {
        "Monday" -> "flakes"
//        "Tuesday" -> "pellets"
        "Wednesday" -> "something"
        "Thursday" -> "anything"
        "Saturday" -> "flakes"
        "Sunday" -> "plankton"
        else -> "fasting"
    }
}

// Lesson 3.10 - default values
//fun main() {
//    swim(time = 1, speed = "slow")
//}

fun swim(time : Int, speed : String = "fast") {
    println ("Swimming $speed")
}


// Lesson 3.11
//fun main() {
//    println(canAddFish(10.0, listOf(3,3,3)))
//    println(canAddFish(8.0, listOf(2,2,2), hasDecorations = false))
//    println(canAddFish(9.0, listOf(1,1,3), 3))
//    println(canAddFish(10.0, listOf(), 7, true))
//}

fun canAddFish(tankSize : Double, currentFish : List<Int>, fishSize : Int = 2, hasDecorations : Boolean = true) : Boolean {
    var totalFishLength : Int = currentFish.sum()

//    for((index, value) in currentFish.withIndex()) {
//        totalFishLength += value
//    }

    return ((totalFishLength+fishSize) <= (tankSize * (if(hasDecorations) 0.8 else 1.0)))
}

// Lesson 3.13 - 3.15

//fun main() {
//    print ("What is your mood today? ")
//    println ("${whatShouldIDoToday(readLine()!!)}")
//}

// Single Expression. One line function syntax. Helper Functions
fun isHappySunny(mood: String, weather: String) : Boolean = (mood == "happy" && weather == "Sunny")
fun isSadRainyCold(mood: String, weather: String, temperature: Int) : Boolean = (mood == "sad" && weather == "rainy" && temperature == 0 )
fun isVeryHot(temperature: Int) : Boolean = temperature > 35

fun whatShouldIDoToday(mood : String, weather : String = "Sunny", temperature : Int = 24) : String {
    val s = when {
        isHappySunny(mood, weather) -> "Go for a walk"
        isSadRainyCold(mood, weather, temperature) -> "stay in bed"
        isVeryHot(temperature) -> "go swimming"
        else -> "Stay home and read"
    }

    return s;
}

// Lesson 3.16 - 3.17
// Filters on a list are eager: Creates a new list with the elements that pass through the filter.
// Lazy behaviour: Use Sequences. Collection one item at the end. Beginning to end.

//fun main() {
//    val spices = listOf("curry", "pepper", "cayenne", "ginger", "red curry", "green curry", "red pepper")
//    println (spices.filter { it.contains("curry")}.sortedBy { it.length })
//    println (spices.filter { it.startsWith( 'c') }.filter { it.endsWith('e') })
//    println (spices.filter { it.startsWith('c') && it.endsWith('e') })
//    println (spices.take(3).filter { it.startsWith('c') })
//
//}

// Lesson 3.18 Lambdas ->
// Anonymous Functions, Function Literals
// Expression that makes a function

//fun main() {
//    var tankDirt = 20
//
//    // Takes an int, returns an int
//    var waterFilter: (Int) -> Int
//    waterFilter = { dirty -> dirty / 2 }
//    println(waterFilter(tankDirt))
//    println(tankDirt)
//
//    updateDirty(5, waterFilter)
//}

// Function that takes a function as a parameter
// Functions arguments as last parameter
// Higher Order Function
fun updateDirty(dirty: Int, operation: (Int) -> Int): Int {
    return operation(dirty)
}

// Lesson 3.19
fun main() {
//    val random1 = random()
//    val random2 = {random()}
//
//    println(random1)
//    println(random1)
//    println(random1)
//    println(random2())
//    println(random2())
//    println(random2())

    // Lambda
    val rollDice = {
        sides: Int ->
        if (sides == 0) 0
        else (1..(sides)).random()
    }

    // Lambda using Function Type Notation. These are more readable than just using lambda.
    val rollDice2: (Int) -> Int
    rollDice2 = {
        sides: Int ->
        if (sides == 0) 0
        else (1..(sides)).random()
    }
    println(rollDice(5))
    println(rollDice2(6))

    gamePlay(rollDice2(6))
}

fun gamePlay( diceRoll: Int ) {
    println(diceRoll)
}

