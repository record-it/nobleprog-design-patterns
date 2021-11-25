package visitor;

public class HtmlVisitor implements Visitor{
    StringBuilder sb = new StringBuilder();

    @Override
    public void visit(Header header) {
        sb.append(String.format("<h%d>%s</h%d>",
                header.level,
                header.content,
                header.level)
        );
    }

    @Override
    public void visit(Body body) {
        sb.append(String.format("<main>"));
        body.body.forEach(item -> item.accept(this));
        sb.append("</main>");
    }

    @Override
    public void visit(Paragraph paragraph) {
        sb.append(String.format("<p>%s</p>",
                paragraph.content
                )
        );
    }

    @Override
    public void visit(Footer footer) {
        sb.append(String.format("<footer>%s</footer>", footer.content));
    }

    @Override
    public void visit(ReportItem item) {
        sb.append(item.content);
    }

    public String toFormatted(){
        return sb.toString();
    }
}
