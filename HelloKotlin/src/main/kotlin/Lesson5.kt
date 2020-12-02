

// Determined at run time
val number = 5

// Determined at compile time
// can only be declared in object or functions, not in classes.
const val CONSTANT = 6

class SomeClass {
    // Must wrap constants inside companion objects
    // Companion object is initiailized from static constructor of class
    // Created when object is created
    companion object {
        const val CLASS_CONSTANT = 7
    }

    // plain object is created lazily, only when first used.
}

// Lesson 5.4 Collections
fun main (args: Array<String>) {
    val testList = listOf(11,12,13,14,15,16,17,18,19,20)

    // returns a new list
    println(testList.reversed())


    val cures = mapOf("a" to "aa", "b" to "bb")

    // These are the same
    println(cures.get("a"))
    println(cures["a"])

    println(cures.getOrDefault("c", "unknown"))
}

fun reverseList(list: List<Int>): List<Int> {
    val result = mutableListOf<Int>()

    for (i in list.size-1 downTo 0) {
        result.add(list.get(i))
    }
    return result
}


// Lesson 5.8 Extension Functions

// Extend classes we don't known
// Available as if it were defined on the class
fun String.hasSpaces(): Boolean = find { it == ' ' } != null

fun extensionsExample() {
    "Does it".hasSpaces()
}

// helper functions relying on public api
// don't have access to private variables,
// resolved statically (at compile time, only considers the type of the variable)

// Lesson 5.10 Generic Classes
// Type like a wild card, fit many types
class MyList<T> {
    fun get(pos: Int): T {
        TODO("Implement")
    }

    fun addItem(item: T) {

    }
}

