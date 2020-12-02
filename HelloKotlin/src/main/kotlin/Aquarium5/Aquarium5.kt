package Aquarium5

data class Fish (var name: String)

fun main (args: Array<String>) {
    fishExamples()
}

fun fishExamples() {
    val fish = Fish("splashy")

    // with is a higher order function
    myWith (fish.name) {
        // don't need this
        println(this.capitalize())

        // capitalize returns copy
    }

    // run takes one lambda, returns the result
    fish.run { name }

    // apply returns the object that it applies to. in this case, fish
    fish.apply {  }

    val fish2 = Fish("bart").apply { name = "Lisa" }
    println(fish2.name)

    // let is useful for chaining manipulations together
    println(fish.let {it.name.capitalize()}
            .let { it + "fish" }
            .let { it.length }
            .let { it + 31 })
}

fun myWith(name: String, block: String.() /* class we are extending, receiver object */ -> Unit) {
    name.block()
}