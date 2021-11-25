package visitor;
/*
 Zefiniuj poniższa klasę jako Visitor, który formatuje raport następująco:
 header -> content z podkreśleniem dla 1, podwójnym dla 2
 paragraph -> content w osobnym wierszu
 footer -> oddzielony pustym wierszem od body i w osobnym wierszu
np.
 Tytuł
 --------
 Podtytył
 ========
 paragraph
 paragraph

 stopka

 */
public class TextVisitor implements Visitor{
    StringBuilder sb = new StringBuilder();
    @Override
    public void visit(Header header) {
        sb.append(header.content).append("\n");
        if (header.level == 1){
            sb.append("-".repeat(header.content.length())).append("\n");
        } else if (header.level == 2){
            sb.append("=".repeat(header.content.length())).append("\n");
        }else {
            sb.append("#".repeat(header.content.length())).append("\n");
        }
    }

    @Override
    public void visit(Body body) {
        body.body.forEach(item -> item.accept(this));
    }

    @Override
    public void visit(Paragraph paragraph) {
        sb.append(paragraph.content).append("\n");
    }

    @Override
    public void visit(Footer footer) {
        sb.append("\n").append(footer.content).append("\n");
    }

    @Override
    public void visit(ReportItem item) {

    }
}
