package br.org.fundatec.solidaula.model.imc;

import br.org.fundatec.solidaula.model.imc.report.Report;
import br.org.fundatec.solidaula.model.imc.report.ReportType;

public class IMCMain {
    public static void main(String[] args) {
        var ana = new PessoaRecord("Ana", 60.0f, 1.68f);
        var joao = new PessoaRecord("Joao", 70.0f, 1.75f);
        System.out.println(ana);
        System.out.println(joao);


        CalculoImc calculoImcAna = new CalculoImc(ana);
        CalculoImc calculoImcJoao = new CalculoImc(joao);

        var reportAna = new Report(ReportType.SIMPLE);
        var reportJoao = new Report(ReportType.HTML);
        var reportJoaoElaborado = new Report(ReportType.ELABORATED);

        reportAna.imprimirIMC(calculoImcAna);
        reportJoao.imprimirIMC(calculoImcJoao);
        reportJoaoElaborado.imprimirIMC(calculoImcJoao);
    }
}
