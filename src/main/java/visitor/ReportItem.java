package visitor;

public abstract class ReportItem implements Visitable{
    final String content;

    protected ReportItem(String content) {
        this.content = content;
    }
}
