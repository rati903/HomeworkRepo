public class Book {
    protected String title;
    protected int numberOfPages;
    protected String author;
    protected boolean isHardcover;

    public Book(String title, int numberOfPages, String author, boolean isHardcover) {
        this.title = title;
        this.numberOfPages = numberOfPages;
        this.author = author;
        this.isHardcover = isHardcover;
    }

    public void read() {
        System.out.println("I am reading " + title + " book.");
    }

    @Override
    public String toString() {
        return "Book{title='" + title + "', numberOfPages=" + numberOfPages + ", author='" + author + "', isHardcover=" + isHardcover + '}';
    }
}
