package flyweight;

import builder.Book;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class BookItem {
    private int id;
    private Book bookDetails;
}
