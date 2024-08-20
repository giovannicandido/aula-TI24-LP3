package br.org.fundatec.solidaula.model.imc;

public class IMCMain {
    public static void main(String[] args) {
        var ana = new PessoaRecord("Ana", 60.0f, 1.68f);
        var joao = new PessoaRecord("Joao", 70.0f, 1.75f);
        System.out.println(ana);
        System.out.println(joao);


        CalculoImc calculoImcAna = new CalculoImc(ana);
        CalculoImc calculoImcJoao = new CalculoImc(joao);
        Report.imprimirIMC(calculoImcAna, ReportType.SIMPLE);
        Report.imprimirIMC(calculoImcJoao, ReportType.HTML);
    }
}
