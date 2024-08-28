package example5solid;

public class PdfPrinter implements Printer {
    @Override
    public void print(String report) {
        System.out.println("Printing PDF report: " + report);
    }
}
