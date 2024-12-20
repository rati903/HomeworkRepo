import java.util.Random;

public class BookAdvisor extends Employee {
    private String libraryType;
    private String[] suggestions;
    private int suggestionCount;

    public BookAdvisor(String firstName, String lastName, int id, String libraryType, int maxSuggestions) {
        super(firstName, lastName, id);
        this.libraryType = libraryType;
        this.suggestions = new String[maxSuggestions];
        this.suggestionCount = 0;
    }

    public void addSuggestion(String book) {
        if (suggestionCount < suggestions.length) {
            suggestions[suggestionCount++] = book;
        } else {
            System.out.println("Cannot add more suggestions. Maximum capacity reached.");
        }
    }

    public String recommendBook() {
        if (suggestionCount == 0) return "No suggestions available.";
        Random random = new Random();
        return suggestions[random.nextInt(suggestionCount)];
    }

    @Override
    public String toString() {
        String result = "BookAdvisor{libraryType='" + libraryType + "', suggestions=[";
        for (int i = 0; i < suggestionCount; i++) {
            result += suggestions[i];
            if (i < suggestionCount - 1) result += ", ";
        }
        result += "], " + super.toString() + "}";
        return result;
    }
}
