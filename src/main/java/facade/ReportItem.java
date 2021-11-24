package facade;
import lombok.Data;

@Data
abstract class ReportItem {
    String content;

    public ReportItem(String content) {
        this.content = content;
    }
}
