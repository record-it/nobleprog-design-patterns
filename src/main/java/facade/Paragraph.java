package facade;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Paragraph extends ReportItem{
    private String content;
}
