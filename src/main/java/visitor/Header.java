package visitor;

import lombok.Builder;

public class Header extends ReportItem implements Visitable{
    final int level;
    @Builder
    protected Header(String content, int level) {
        super(content);
        this.level = level;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
