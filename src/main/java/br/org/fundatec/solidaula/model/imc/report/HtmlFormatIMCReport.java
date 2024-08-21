package br.org.fundatec.solidaula.model.imc.report;

import br.org.fundatec.solidaula.model.imc.CalculoImc;

public class HtmlFormatIMCReport implements ReportFormatIMC{
    @Override
    public String format(CalculoImc calculoImc) {
        return """
                    <html>
                    <head>Resultado IMC</head>
                    <body>
                        <h1>%s</h1>
                        <b>Resultado: <b/> %s. Classificação %s
                    </body>
                    </html>
                    
                    """.formatted(calculoImc.getNomePessoa(), calculoImc.calcular(), calculoImc.classificar());
    }
}
