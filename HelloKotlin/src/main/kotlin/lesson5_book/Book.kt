package lesson5_book

class Book(val title: String, val author: String, val year: String) {

    fun titleAndAuthor(): Pair<String, String> {
        return title to author
    }

    fun titleAuthorAndYear(): Triple<String, String, String> {
        return Triple(title, author, year)
    }
}

fun main(args: Array<String>) {
    val book: Book("Some Book", "Some Guy", "Some Year")

}
