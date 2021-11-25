package builder;

import lombok.ToString;

@ToString
public class Book {
    private String title;
    private String author;
    private int publishingYear;

    private Book(String title, String author, int publishingYear) {
        this.title = title;
        this.author = author;
        this.publishingYear = publishingYear;
    }

    public static RequiredTitle builder(){
        final Builder builder = new Builder();
        /*
         Lambda zwracająca obiekt interfejsu RequiredTitle
         */
        return title -> {
            builder.title = title;
            /*
             Lambda zwracająca obiekt interfejsu RequiredAuthor
             */
            return author -> {
                builder.author = author;
                /*
                 Zwracamy obiekt budowniczego
                 */
                return builder;
            };
        };
    }
    /*
     Iterfejsy wymaganych parametrów konstruktora
     */
    public interface RequiredTitle{
        RequiredAuthor title(String title);
    }

    public interface RequiredAuthor{
        Builder author(String title);
    }
    /*
     W klasie budowniczego definiujemy tylko metody do parametrów opcjonalnych
     */
    public static class Builder{
        private String title;
        private String author;
        private int publishingYear;

        private Builder() {
        }

        public Builder publishingYear(int publishingYear){
            this.publishingYear = publishingYear;
            return this;
        }

        public Book build(){
            return new Book(title, author, publishingYear);
        }
    }
}
