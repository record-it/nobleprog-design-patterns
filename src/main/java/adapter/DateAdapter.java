package adapter;

import java.time.LocalDate;
import java.util.Date;

public class DateAdapter {
    private final Date adaptee;


    public DateAdapter(Date adaptee) {
        this.adaptee = adaptee;
    }

    public LocalDate adapte(){
        return LocalDate.of(adaptee.getYear(), adaptee.getMonth(), adaptee.getDay());
    }
}
