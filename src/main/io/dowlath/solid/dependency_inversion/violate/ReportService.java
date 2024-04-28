package io.dowlath.solid.dependency_inversion.violate;

/*
The principle states that we must use abstraction (abstract classes and interfaces)
instead of concrete implementations. The DIP states that:

High-level modules should not depend on low-level modules.
Both should depend on abstractions.

Abstractions should not depend on details.
Details should depend on abstractions.

In simpler terms, the principle encourages you to rely on interfaces or
abstract classes to decouple your code and make it easier to extend, maintain, and test.
 */

class PDFReportGenerator {
    public void generatePDFReport() {
        // PDF generation logic
    }
}

class HTMLReportGenerator {
    public void generateHTMLReport() {
        // HTML generation logic
    }
}

class ReportService {
    private PDFReportGenerator pdfGenerator;
    private HTMLReportGenerator htmlGenerator;

    public ReportService() {
        pdfGenerator = new PDFReportGenerator();
        htmlGenerator = new HTMLReportGenerator();
    }

    public void generatePDFReport() {
        pdfGenerator.generatePDFReport();
    }

    public void generateHTMLReport() {
        htmlGenerator.generateHTMLReport();
    }
}
