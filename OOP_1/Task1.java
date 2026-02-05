package OOP_1;

public class Task1 {

    public static void main(String[] args) {

        // Створення об'єктів класу Book 
        Book book1 = new Book("1984", "George Orwell", 1949, 328, "dystopia");
        Book book2 = new Book("Harry Potter and the Philosopher Stone", "J.K. Rowling", 1997, 223, "fantasy");
        Book book3 = new Book("The Lord of the Rings", "J.R.R. Tolkien", 1954, 1178, "fantasy");
        Book book4 = new Book("The Hunger Games", "Suzanne Collins", 2012, 374, "science fiction");
        Book book5 = new Book("Gone Girl", "Gillian Flynn", 2014, 432, "thriller");
        Book book6 = new Book("The Fault in Our Stars", "John Green", 2012, 313, "romance");

        // Масив об'єктів Book
        Book[] books = { book1, book2, book3, book4, book5, book6 };

        // Виведення інформації про всі книги
        System.out.println("=== Book information ===");
        for (Book book : books) {
            System.out.println(book.getInfo());
            System.out.println("Modern book: " + book.isModern());
            System.out.println();
        }

        // Пошук книги за назвою
        String searchTitle = "Harry Potter and the Philosopher Stone";
        System.out.println("=== Search book by title: " + searchTitle + " ===");

        boolean found = false;
        for (Book book : books) {
            if (book.title.equalsIgnoreCase(searchTitle)) {
                System.out.println("Book found:");
                System.out.println(book.getInfo());
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Book not found.");
        }

        System.out.println();

        // Перевірка жанру книги
        System.out.println("=== Genre check ===");
        System.out.println(
                "Is \"" + book3.title + "\" fantasy? " + book3.hasGenre("fantasy")
        );

        System.out.println();

        // Порівняння двох книг за кількістю сторінок
        System.out.println("=== Page comparison ===");
        book4.comparePages(book5);
    }
}
