public class Main {
    public static void main(String[] args) {
        Library library = new Library( "Library", 10, 10);

        BookCleaner cleaner = new BookCleaner("Gocha", "Chertkoevi", 01);
        BookDealer dealer = new BookDealer("Venera", "Obolashvili", 02, "8:00", "6:00 ");
        SilenceController controller = new SilenceController("dkdk", "dkdkkd", 03, 9.1);
        BookAdvisor advisor = new BookAdvisor("pdppdp", "jdjdjd", 04, "fkfkfkf", 5);

        library.addEmployee(cleaner);
        library.addEmployee(dealer);
        library.addEmployee(controller);
        library.addEmployee(advisor);

        AdventureBook adventureBook = new AdventureBook("bbbjvgghvj", 150, "jjjuhiugib", false);
        ScienceBook scienceBook = new ScienceBook("hhhhjjjj", 170, "hhjiy", false, "edhdhhdd");
        FantasyBook fantasyBook = new FantasyBook("ffffjfjfjjfjf", 146, "f4545rfd", true, "ffggfdrg");

        library.addBook(adventureBook);
        library.addBook(scienceBook);
        library.addBook(fantasyBook);

        advisor.addSuggestion(adventureBook.title);
        advisor.addSuggestion(scienceBook.title);
        advisor.addSuggestion(fantasyBook.title);

        System.out.println("Book recommendation: " + advisor.recommendBook());

        System.out.println(library);
    }
}
