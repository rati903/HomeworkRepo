public class ScienceBook extends Book {
    private String fieldOfScience;

    public ScienceBook(String title, int numberOfPages, String author, boolean isHardcover, String fieldOfScience) {
        super(title, numberOfPages, author, isHardcover);
        this.fieldOfScience = fieldOfScience;
    }

    @Override
    public String toString() {
        return "ScienceBook{fieldOfScience='" + fieldOfScience + "', " + super.toString() + "}";
    }
}
