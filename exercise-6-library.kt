data class Book(var title: String, var author: String, var pages: Int, var isBorrowed: Boolean)

class Library {
  private val books: MutableList<Book> = mutableListOf()

  fun addBook(book: Book) {
    books.add(book)
  }

  fun borrowBook(title: String) {
    val book = books.find { it.title == title && !it.isBorrowed }
    if (book != null) {
      book.isBorrowed = true
      println("Livro '${book.title}' emprestado com sucesso!")
    } else {
      println("Livro não disponível para empréstimo.")
    }
  }

  fun returnBorrowedBook(title: String) {
    val book = books.find { it.title == title && it.isBorrowed }
    if (book != null) {
      book.isBorrowed = false
      println("Livro '${book.title}' devolvido com sucesso!")
    } else {
      println("Livro não encontrado ou já disponível.")
    }
  }

  fun isBookAvailable(title: String): Boolean {
    return books.any { it.title == title && !it.isBorrowed }
  }

  fun listAllBooks() {
    println("Coleção de livros na biblioteca:")
    books.forEach {
      println(
              "${it.title} - ${it.author} (${it.pages} páginas) - ${if (it.isBorrowed) "Emprestado" else "Disponível"}"
      )
    }
  }

  fun listBorrowedBooks() {
    val borrowedBooks = books.filter { it.isBorrowed }
    if (borrowedBooks.isEmpty()) {
      println("Nenhum livro emprestado no momento.")
    } else {
      println("Livros emprestados:")
      borrowedBooks.forEach { println("${it.title} - ${it.author}") }
    }
  }

  fun listAvailableBooks() {
    val availableBooks = books.filter { !it.isBorrowed }
    if (availableBooks.isEmpty()) {
      println("Nenhum livro disponível no momento.")
    } else {
      println("Livros disponíveis:")
      availableBooks.forEach { println("${it.title} - ${it.author}") }
    }
  }

  fun getTotalBooks(): Int = books.size

  fun getBorrowedBooksCount(): Int = books.count { it.isBorrowed }

  fun getAvailableBooksCount(): Int = books.count { !it.isBorrowed }
}

fun main() {
  val library = Library()

  val book1 = Book("Livro1", "Autor1", 100, false)
  val book2 = Book("Livro2", "Autor2", 200, true)

  library.addBook(book1)
  library.addBook(book2)

  library.listAllBooks()
  library.listAvailableBooks()

  library.borrowBook("Livro1")
  library.listBorrowedBooks()

  library.returnBorrowedBook("Livro1")
  library.listAvailableBooks()

  println("\nEstatísticas da Biblioteca:")
  println("Total de livros: ${library.getTotalBooks()}")
  println("Livros emprestados: ${library.getBorrowedBooksCount()}")
  println("Livros disponíveis: ${library.getAvailableBooksCount()}")
}
