package br.org.fundatec.solidaula.model.imc.report;

import br.org.fundatec.solidaula.model.imc.CalculoImc;

public class EleboratedReportFormatIMC implements ReportFormatIMC {
    @Override
    public String format(CalculoImc calculoImc) {
        return """
                ///////=====================////////////
                ////// Report Eleborado    ////////////
                /////=====================////////////
                |   Nome Pessoa: %s                 |
                |   IMC: %s                         |
                |   Classificacao: %s               |
                |                                   |
                |           FIM REPORT              |
                //----------------------------------//
                """.formatted(calculoImc.getNomePessoa(), calculoImc.calcular(), calculoImc.classificar());
    }
}
