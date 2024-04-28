package io.dowlath.solid.dependency_inversion.non_violate;

class ReportService {
    private ReportGenerator reportGenerator;

    public ReportService(ReportGenerator generator) {
        this.reportGenerator = generator;
    }

    public void generateReport() {
        reportGenerator.generateReport();
    }
}