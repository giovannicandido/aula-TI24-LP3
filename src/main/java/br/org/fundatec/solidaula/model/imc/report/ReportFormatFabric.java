package br.org.fundatec.solidaula.model.imc.report;

import java.util.Map;
import java.util.Objects;

public class ReportFormatFabric {

    private static final Map<ReportType, ReportFormatIMC> AVAILABLE_REPORTS = Map.of(
            ReportType.SIMPLE, new SimpleFormatIMCReport(),
            ReportType.PDF, new PDFReportFormatIMC(),
            ReportType.ELABORATED, new EleboratedReportFormatIMC(),
            ReportType.HTML, new HtmlFormatIMCReport()
    );


    public static ReportFormatIMC build(ReportType reportType) {
        var report = AVAILABLE_REPORTS.get(reportType);
        if(Objects.isNull(report)) {
            return new SimpleFormatIMCReport();
        }
        return report;
    }
}
