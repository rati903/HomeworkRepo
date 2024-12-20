public class SilenceController extends Employee {
    private double strictness;

    public SilenceController(String firstName, String lastName, int id, double strictness) {
        super(firstName, lastName, id);
        this.strictness = strictness;
    }

    @Override
    public String toString() {
        return "SilenceController{strictness=" + strictness + ", " + super.toString() + "}";
    }
}
