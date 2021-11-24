package adapter;

public class AdapterDemo {
    public static void main(String[] args) {
        LegacyReportGenerator generator = new LegacyReportGenerator();
        ReportArchive archive = new ReportArchive();

        DateAdapter adapter = new DateAdapter(generator.getReportDate());

        archive.setReportDate(adapter.adapte());
    }
}
