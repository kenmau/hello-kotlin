package Aquarium

// Lesson 4.13

// Singleton. Only instantiate ever one instances
object MobyDickWhale {

}

// Enums are also one instance
enum class Color(val rgb: Int) {
    RED(0xFF0000),
    GREEN( 0x00FF00),
    BLUE(0X0000FF),
    YELLOW(0xFFFF00)
}

// Class can be subclassed only within the file
// Kotlin will know all classes at compile time
// Extra checks
// Safe way to represent fixed number of types
// Great for returning true/false for network requests
sealed class Seal

class SeaLion: Seal()
class Walrus: Seal()