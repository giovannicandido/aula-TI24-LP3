package br.org.fundatec.solidaula.model.imc.report;

import br.org.fundatec.solidaula.model.imc.CalculoImc;

public class Report {
    private final ReportFormatIMC reportFormatIMC;

    // Dependency Inversion Principle
    // No spring isso é feito por injeção de dependencia, que é uma implementação do principio de inversão de dependencia
    public Report(ReportFormatIMC reportFormatIMC) {
        this.reportFormatIMC = reportFormatIMC;
    }

    public void imprimirIMC(CalculoImc calculoImc) {
        System.out.println("Gerando relatorio...");
        var format = reportFormatIMC.format(calculoImc);
        System.out.println(format);
    }

}
