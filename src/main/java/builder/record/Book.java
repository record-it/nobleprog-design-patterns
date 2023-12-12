package builder.record;

public class Book {
    public record Title(String value){}
    public record Author(String value) {}
    public record PublishingYear(int value){}
        private String title;
        private String author;
        private int publishingYear;
        public Book(Title title, Author author, PublishingYear publishingYear) {
            this.title = title.value;
            this.author = author.value;
            this.publishingYear = publishingYear.value;
        }
    }
