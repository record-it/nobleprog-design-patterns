package facade;

import lombok.Builder;
import lombok.Data;

class Header extends ReportItem{
    @Builder
    Header(String content) {
        super(content);
    }
}
