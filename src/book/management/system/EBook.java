package book.management.system;

public class EBook extends Book {
    private double fileSize;

    public EBook(String title, String author, String isbn, double fileSize) {
        super(title, author, isbn);
        this.fileSize = fileSize;
    }

    public double getFileSize() {
        return fileSize;
    }

    @Override
    public String getBook() {
        return super.toString() + ", File Size: " + fileSize + "MB";
    }
}
