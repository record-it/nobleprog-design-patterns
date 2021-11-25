package visitor;

import lombok.Builder;

public class Paragraph extends ReportItem implements Visitable{
    @Builder
    protected Paragraph(String content) {
        super(content);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
