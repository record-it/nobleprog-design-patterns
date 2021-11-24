package facade;
import lombok.Builder;

public class Paragraph extends ReportItem{
    @Builder
    Paragraph(String content) {
        super(content);
    }

    @Override
    public String toString() {
        return  content;
    }
}
