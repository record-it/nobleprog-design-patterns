package visitor;

import lombok.Builder;


public class Footer extends ReportItem implements Visitable{
    @Builder
    protected Footer(String content) {
        super(content);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
