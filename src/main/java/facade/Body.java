package facade;

import java.util.ArrayList;
import java.util.List;


class Body {
    List<ReportItem> content = new ArrayList<>();

    void addItem(ReportItem item){
        content.add(item);
    }

    @Override
    public String toString() {
        return "Body{" +
                "content=" + content +
                '}';
    }
}
