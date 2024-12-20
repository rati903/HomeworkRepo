public class Library {
    private String name;
    private Employee[] employees;
    private Book[] books;
    private int employeeCount;
    private int bookCount;

    public Library(String name, int maxEmployees, int maxBooks) {
        this.name = name;
        this.employees = new Employee[maxEmployees];
        this.books = new Book[maxBooks];
        this.employeeCount = 0;
        this.bookCount = 0;
    }

    public void addEmployee(Employee employee) {
        if (employeeCount < employees.length) {
            employees[employeeCount++] = employee;
        } else {
            System.out.println("Cannot add more employees. Maximum capacity reached.");
        }
    }

    public void addBook(Book book) {
        if (bookCount < books.length) {
            books[bookCount++] = book;
        } else {
            System.out.println("Cannot add more books. Maximum capacity reached.");
        }
    }

    public Book[] getBooks() {
        return books;
    }

    @Override
    public String toString() {
        String result = "Library{name='" + name + "', employees=[";
        for (int i = 0; i < employeeCount; i++) {
            result += employees[i];
            if (i < employeeCount - 1) result += ", ";
        }
        result += "], books=[";
        for (int i = 0; i < bookCount; i++) {
            result += books[i];
            if (i < bookCount - 1) result += ", ";
        }
        result += "]}";
        return result;
    }
}

