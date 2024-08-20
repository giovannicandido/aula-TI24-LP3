package br.org.fundatec.solidaula.model.imc;

// Linkovsky substitution
public class SimpleFormatIMCReport implements ReportFormatIMC {

    @Override
    public String format(CalculoImc calculoImc) {
        return "IMC para %s é %.2f. Classificação: %s".formatted(calculoImc.getNomePessoa(), calculoImc.calcular(), calculoImc.classificar());
    }
}
