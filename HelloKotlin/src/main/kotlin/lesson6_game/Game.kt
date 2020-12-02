package lesson6_game

class Game {
    var path = mutableListOf<Direction>()

    init {
        path.add(Direction.START)
    }

    // lambda
    val north = { path.add(Direction.NORTH) }
    val south = { path.add(Direction.SOUTH) }
    val east = { path.add(Direction.EAST) }
    val west = { path.add(Direction.WEST) }

    val end = {
        path.add(Direction.END)
        println("Game Over: ${path}")
        path.clear()
        false
    }
}

fun main (args: Array<String>) {
    val game: Game = Game()

    println("Game: ${game.path}")
    game.north()
    game.east()
    game.south()
    game.west()
    game.end()
    println("Game: ${game.path}")
}