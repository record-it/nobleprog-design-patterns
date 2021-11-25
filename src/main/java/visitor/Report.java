package visitor;

public class Report implements Visitable{
    Header title;
    Body body;
    Footer footer;

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(title);
        visitor.visit(body);
        visitor.visit(footer);
    }
}
