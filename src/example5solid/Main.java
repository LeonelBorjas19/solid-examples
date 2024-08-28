package example5solid;

public class Main {
    public static void main(String[] args) {
        Printer pdfPrinter = new PdfPrinter();
        ReportGenerator reportGenerator = new ReportGenerator(pdfPrinter);

        reportGenerator.generateReport("Annual Report");
    }
}