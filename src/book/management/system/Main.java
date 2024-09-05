package book.management.system;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Library newLibrary = new Library();
        Book book1 = new Book("abc", "cde", "0999-111");
        EBook ebook1 = new EBook("abc", "cde", "0999-121", 12);
        AudioBook audioBook1 = new AudioBook("abc", "cde", "0999-1114", 30);
        newLibrary.addBook(book1);
        newLibrary.addBook(ebook1);
        newLibrary.addBook(audioBook1);

        newLibrary.searchByTitle("a");
        List<Book> books = newLibrary.getAllBooks();
        for(Book b: books) {
            System.out.println("List Book of Library: " + b.getBook());
        }
    }
}
