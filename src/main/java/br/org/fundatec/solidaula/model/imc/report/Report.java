package br.org.fundatec.solidaula.model.imc.report;

import br.org.fundatec.solidaula.model.imc.CalculoImc;

import java.util.Map;
import java.util.Objects;

public class Report {
    private ReportFormatIMC reportFormatIMC;

    private static final Map<ReportType, ReportFormatIMC> AVAILABLE_REPORTS = Map.of(
          ReportType.SIMPLE, new SimpleFormatIMCReport(),
          ReportType.PDF, new PDFReportFormatIMC(),
          ReportType.ELABORATED, new EleboratedReportFormatIMC(),
          ReportType.HTML, new HtmlFormatIMCReport()
    );

    public Report(ReportType reportType) {
        this.reportFormatIMC = reportFabric(reportType);
    }

    public void imprimirIMC(CalculoImc calculoImc) {
        System.out.println("Gerando relatorio...");
        var format = reportFormatIMC.format(calculoImc);
        System.out.println(format);
    }

    public ReportFormatIMC reportFabric(ReportType reportType) {
        var report = AVAILABLE_REPORTS.get(reportType);
        if(Objects.isNull(report)) {
            return new SimpleFormatIMCReport();
        }
        return report;
    }
}
