package OOP_1;

public class Book {

    // Поля класу
    String title;
    String author;
    int year;
    int pages;
    String genre;

    // Конструктор класу Book
    public Book(String title, String author, int year, int pages, String genre) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.pages = pages;
        this.genre = genre;
    }

    // Метод для отримання інформації про книгу
    public String getInfo() {
        return "Title: " + title
                + ", Author: " + author
                + ", Year: " + year
                + ", Pages: " + pages
                + ", Genre: " + genre;
    }

    // Метод для перевірки, чи книга є сучасною
    public boolean isModern() {
        return year > 2010;
    }

    // Метод для перевірки жанру книги
    public boolean hasGenre(String searchGenre) {
        return genre.equalsIgnoreCase(searchGenre);
    }

    // Метод для порівняння двох книг за кількістю сторінок
    public void comparePages(Book otherBook) {
        if (this.pages > otherBook.pages) {
            System.out.println(
                    "The book \"" + this.title + "\" has more pages than \"" + otherBook.title + "\"."
            );
        } else if (this.pages < otherBook.pages) {
            System.out.println(
                    "The book \"" + otherBook.title + "\" has more pages than \"" + this.title + "\"."
            );
        } else {
            System.out.println("Both books have the same number of pages.");
        }
    }
}
