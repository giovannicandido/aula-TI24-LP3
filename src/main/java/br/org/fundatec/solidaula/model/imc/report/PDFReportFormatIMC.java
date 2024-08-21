package br.org.fundatec.solidaula.model.imc.report;

import br.org.fundatec.solidaula.model.imc.CalculoImc;

public class PDFReportFormatIMC implements ReportFormatIMC{
    @Override
    public String format(CalculoImc calculoImc) {
        return """
                {PDF}
                    {Nome}: %s
                    {Calculo: } %s
                    {Classificacao: } %s
                {PDF}
                """.formatted(calculoImc.getNomePessoa(), calculoImc.calcular(), calculoImc.classificar());
    }
}
