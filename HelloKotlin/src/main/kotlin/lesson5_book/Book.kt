package lesson5_book

import java.util.*

const val MAX_NUMBER_BOOKS = 10

object Constants {
    const val BASE_URL = "http://someurl.com"
}

class Book(val title: String, val author: String, val year: String, var pages: Int) {

    fun titleAndAuthor(): Pair<String, String> {
        return title to author
    }

    fun titleAuthorAndYear(): Triple<String, String, String> {
        return Triple(title, author, year)
    }

    fun canBorrow(hasBorrow: Int): Boolean {
        if (hasBorrow < MAX_NUMBER_BOOKS) {
            return true
        }

        return false
    }

    fun printUrl() {
        println("${Constants.BASE_URL}${title}.html")
    }

}

fun Book.weight(): Double = pages * 1.5
fun Book.tornPages(tornPages: Int) {
    if (pages >= tornPages)
        pages = pages - tornPages
    else
        pages = 0
}

class Puppy() {
    fun playWithBook(book: Book) {
        book.tornPages(Random().nextInt(book.pages)+1)
    }
}

fun main(args: Array<String>) {
    val book = Book("Some Book", "Some Guy", "Some Year", 100)
    val bookTitleAuthor = book.titleAndAuthor()
    val bookTitleAuthorYear = book.titleAuthorAndYear()

    println("Here is your book ${bookTitleAuthor.first}, written by ${bookTitleAuthor.second} in ${bookTitleAuthorYear.third}")

    val allBooks: Set<String> = setOf("Romeo", "Hamlet", "Summer")
    val library = mapOf("William" to allBooks)

    println(library.any { it.value.contains("Hamlet") })

    val moreBooks = mutableMapOf("Roger" to "Rabbit")
    // getOrPut() takes a lambda and creates an entry in the mutableMap
    moreBooks.getOrPut("Bugs") {"Bunny"}
    println(moreBooks)

    book.printUrl()

    val pup = Puppy()

    while (book.pages > 0) {
        pup.playWithBook(book)
        println("Book has ${book.pages} left")
    }

    println("Book has ${book.pages}")
}
