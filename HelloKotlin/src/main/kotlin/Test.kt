import java.util.*

//fun main(args : Array<String>) {
//    val time : String = args[0]
//    val timeInInt : Int = time.toInt()
//
//    println("How do I feel?: ${whatShouldIDoToday(readLine()!!)}")
//
//    println ( when (timeInInt) {
//            in 0..11 -> "Good morning, Kotlin"
//            else -> "Good night, Kotlin"
//        }
//    )
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
//
//}

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


fun feedTheFish() {
    val day = randomDay()
    val food = fishFood(day)

    println ("Today is $day and the fish eat $food")
}

fun fishFood(day : String) : String {
    return when (day) {
        "Monday" -> "flakes"
        "Tuesday" -> "pellets"
        "Wednesday" -> "something"
        "Thursday" -> "anything"
        "Saturday" -> "flakes"
        "Sunday" -> "plankton"
        else -> "fasting"
    }
}

fun swim(speed : String = "fast") {
    println ("Swimming $speed")
}

fun randomDay() : String {
    val week = listOf ("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday")

    return week[Random().nextInt(7)]
}

//Lesson 3 Quiz 7
fun main() {
    var fortune: String = ""
    while (!fortune.contains("take it easy")) {
        fortune = getFortuneCookie(getBirthday())
        println ("Your fortune is: $fortune")
    }

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

fun getBirthday() : Int {
    print ("Enter your birthday: ")
    return readLine()?.toIntOrNull() ?: 1
}

fun canAddFish(tankSize : Double, currentFish : List<Int>, fishSize : Int = 2, hasDecorations : Boolean = true) : Boolean {
    var totalFishLength : Int = currentFish.sum()

//    for((index, value) in currentFish.withIndex()) {
//        totalFishLength += value
//    }

    return ((totalFishLength+fishSize) <= (tankSize * (if(hasDecorations) 0.8 else 1.0)))
}