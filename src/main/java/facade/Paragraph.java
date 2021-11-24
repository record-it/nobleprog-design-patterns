package facade;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

public class Paragraph extends ReportItem{
    @Builder
    Paragraph(String content) {
        super(content);
    }
}
