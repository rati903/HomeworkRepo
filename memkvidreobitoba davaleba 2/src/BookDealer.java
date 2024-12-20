public class BookDealer extends Employee {
    private String availableFrom;
    private String availableTo;

    public BookDealer(String firstName, String lastName, int id, String availableFrom, String availableTo) {
        super(firstName, lastName, id);
        this.availableFrom = availableFrom;
        this.availableTo = availableTo;
    }

    @Override
    public String toString() {
        return "BookDealer{availableFrom='" + availableFrom + "', availableTo='" + availableTo + "', " + super.toString() + "}";
    }
}
