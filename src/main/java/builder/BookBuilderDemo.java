package builder;

public class BookBuilderDemo {
    public static void main(String[] args) {
        final Book book = Book.builder()
                .title("Java")
                .author("Bloch")
                .publishingYear(2018)
                .build();
        System.out.println(book);
    }
}
