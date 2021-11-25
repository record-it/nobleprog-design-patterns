package flyweight;

import builder.Book;

import java.util.ArrayList;
import java.util.List;

public class LibraryDemo {
    public static void main(String[] args) {
        final Book javaDetails = Book.builder().title("Java").author("Bloch").publishingYear(2020).build();
        List<BookItem> library = new ArrayList<>();
        library.add(BookItem.builder().bookDetails(javaDetails).id(1).build());
        library.add(BookItem.builder().bookDetails(javaDetails).id(2).build());
        library.add(BookItem.builder().bookDetails(javaDetails).id(3).build());
    }
}
