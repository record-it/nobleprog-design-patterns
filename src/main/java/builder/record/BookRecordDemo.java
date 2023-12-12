package builder.record;

public class BookRecordDemo {
    public static void main(String[] args) {
        Book book = new Book(
                new Book.Title("Java"),
                new Book.Author("Bloch"),
                new Book.PublishingYear(2021)
        );
    }
}
