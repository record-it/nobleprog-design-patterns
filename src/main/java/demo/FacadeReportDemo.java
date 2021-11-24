package demo;

import facade.Report;

public class FacadeReportDemo {
    public static void main(String[] args) {
        Report report = new Report();
        report.addHeader("Nagłówek");
        report.addHeaderBody("Nagłówek ciała");
        report.addParagraphBody("Paragraf 1");
        System.out.println(report.toString());
    }
}
