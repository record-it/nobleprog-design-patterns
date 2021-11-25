package visitor;

public interface Visitor {
    void visit(Header header);
    void visit(Body body);
    void visit(Paragraph paragraph);
    void visit(Footer footer);
    void visit(ReportItem item);
}
