package facade;

import lombok.Builder;
class Header extends ReportItem{
    @Builder
    Header(String content) {
        super(content);
    }

    @Override
    public String toString() {
        return content;
    }
}
