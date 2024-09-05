package book.management.system;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books;

    public Library() {
        books = new ArrayList<>();
    }

    public void addBook(Book book) {
        for (Book b: books) {
            if (b.getIsbn().equals(book.getIsbn())) {
                System.out.println("Book already exists.");
                return;
            }
        }
        System.out.println("New Book added: " + book.getTitle());
        books.add(book);
    }

    public void removeBook(String isbn) {
        books.removeIf(book -> book.getIsbn().equals(isbn));
    }

    public List<Book> searchByTitle(String title) {
        List<Book> resultBook = new ArrayList<Book>();
        for (Book book : books) {
            if (book.getTitle().toLowerCase().contains(title.toLowerCase())) {
                resultBook.add(book);
            }
        }
        return resultBook;
    }

    public List<Book> getAllBooks() {
        return new ArrayList<Book>(books);
    }

}
