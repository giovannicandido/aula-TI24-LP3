package br.org.fundatec.solidaula.model.imc;

public class Report {
    private ReportFormatIMC reportFormatIMC;

    public Report(ReportType reportType) {
        this.reportFormatIMC = reportFabric(reportType);
    }

    public void imprimirIMC(CalculoImc calculoImc) {
        System.out.println("Gerando relatorio...");
        var format = reportFormatIMC.format(calculoImc);
        System.out.println(format);
    }

    public ReportFormatIMC reportFabric(ReportType reportType) {
        if(reportType == ReportType.SIMPLE) {
            return  new SimpleFormatIMCReport();
        } else {
            return new HtmlFormatIMCReport();
        }
    }
}
