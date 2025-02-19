interface Book {
  title: string;
  author: string;
  pages: number;
  isBorrowed: boolean;
}

class Library {
  private books: Book[] = [];

  addBook(book: Book): void {
    this.books.push(book);
  }

  borrowBook(title: string): void {
    const book = this.books.find((b) => b.title === title && !b.isBorrowed);
    if (!book) {
      console.log("Livro não disponível para empréstimo.");
      return;
    }

    book.isBorrowed = true;
    console.log(`Livro '${book.title}' emprestado com sucesso!`);
  }

  returnBorrowedBook(title: string): void {
    const book = this.books.find((b) => b.title === title && b.isBorrowed);
    if (!book) {
      console.log("Livro não encontrado ou já disponível.");
      return;
    }

    book.isBorrowed = false;
    console.log(`Livro '${book.title}' devolvido com sucesso!`);
  }

  isBookAvailable(title: string): boolean {
    return this.books.some((b) => b.title === title && !b.isBorrowed);
  }

  listAllBooks(): void {
    console.log("Coleção de livros na biblioteca:");
    this.books.forEach((b) => {
      console.log(
        `${b.title} - ${b.author} (${b.pages} páginas) - ${
          b.isBorrowed ? "Emprestado" : "Disponível"
        }`
      );
    });
  }

  listBorrowedBooks(): void {
    const borrowedBooks = this.books.filter((b) => b.isBorrowed);
    if (borrowedBooks.length === 0) {
      console.log("Nenhum livro emprestado no momento.");
      return;
    }

    console.log("Livros emprestados:");
    borrowedBooks.forEach((b) => console.log(`${b.title} - ${b.author}`));
  }

  listAvailableBooks(): void {
    const availableBooks = this.books.filter((b) => !b.isBorrowed);
    if (availableBooks.length === 0) {
      console.log("Nenhum livro disponível no momento.");
      return;
    }

    console.log("Livros disponíveis:");
    availableBooks.forEach((b) => console.log(`${b.title} - ${b.author}`));
  }

  getTotalBooks(): number {
    return this.books.length;
  }

  getBorrowedBooksCount(): number {
    return this.books.filter((b) => b.isBorrowed).length;
  }

  getAvailableBooksCount(): number {
    return this.books.filter((b) => !b.isBorrowed).length;
  }
}

const library = new Library();

const book1: Book = {
  title: "Livro1",
  author: "Autor1",
  pages: 100,
  isBorrowed: false,
};
const book2: Book = {
  title: "Livro2",
  author: "Autor2",
  pages: 200,
  isBorrowed: true,
};

library.addBook(book1);
library.addBook(book2);

library.listAllBooks();
library.listAvailableBooks();

library.borrowBook("Livro1");
library.listBorrowedBooks();

library.returnBorrowedBook("Livro1");
library.listAvailableBooks();

console.log("\nEstatísticas da Biblioteca:");
console.log(`Total de livros: ${library.getTotalBooks()}`);
console.log(`Livros emprestados: ${library.getBorrowedBooksCount()}`);
console.log(`Livros disponíveis: ${library.getAvailableBooksCount()}`);
