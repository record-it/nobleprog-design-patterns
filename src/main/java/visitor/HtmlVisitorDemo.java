package visitor;

public class HtmlVisitorDemo {
    public static void main(String[] args) {
        Report report = new Report();
        report.body = new Body();
        report.body.body.add(new Header("tytuł rozdziału", 2));
        report.body.body.add(new Paragraph("Tekst paragrafu 1"));
        report.body.body.add(new Paragraph("Tekst paragrafu 2"));
        report.body.body.add(new Paragraph("Tekst paragrafu 3"));
        report.title = new Header("Tytuł raportu", 1);
        report.footer = new Footer("Stopka raportu");
        HtmlVisitor htmlFomatter = new HtmlVisitor();
        report.accept(htmlFomatter);
        System.out.println(htmlFomatter.toFormatted());

    }
}
