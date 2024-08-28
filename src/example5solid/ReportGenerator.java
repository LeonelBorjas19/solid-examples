package example5solid;

public class ReportGenerator {
    private Printer printer;

    public ReportGenerator(Printer printer) {
        this.printer = printer; // Dependencia en la abstracción
    }

    public void generateReport(String report) {
        // Lógica para generar el informe
        printer.print(report); // Uso de la abstracción
    }
}
