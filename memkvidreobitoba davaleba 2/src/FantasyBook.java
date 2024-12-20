public class FantasyBook extends Book {
    private String country;

    public FantasyBook(String title, int numberOfPages, String author, boolean isHardcover, String country) {
        super(title, numberOfPages, author, isHardcover);
        this.country = country;
    }

    @Override
    public String toString() {
        return "FantasyBook{country='" + country + "', " + super.toString() + "}";
    }
}
