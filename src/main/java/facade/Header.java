package facade;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
class Header extends ReportItem{
    private String content;
}
