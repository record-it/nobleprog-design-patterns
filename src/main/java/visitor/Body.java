package visitor;

import java.util.ArrayList;
import java.util.List;

public class Body implements Visitable{
    List<ReportItem> body = new ArrayList<>();

    @Override
    public void accept(Visitor visitor) {
       visitor.visit(this);
    }
}
