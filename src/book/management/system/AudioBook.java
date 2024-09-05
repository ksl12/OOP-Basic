package book.management.system;

public class AudioBook extends Book{
    private double duration;

    public AudioBook(String title, String author, String isbn, double duration) {
        super(title, author, isbn);
        this.duration = duration;
    }

    public double getDuration() {
        return duration;
    }

    @Override
    public String getBook() {
        return super.getBook() + ", Duration: " + duration + " hours";
    }

}
