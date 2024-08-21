package br.org.fundatec.solidaula.model.imc;

import br.org.fundatec.solidaula.model.imc.report.Report;
import br.org.fundatec.solidaula.model.imc.report.ReportType;

import java.util.Arrays;
import java.util.Scanner;

public class IMCMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        var ana = new PessoaRecord("Ana", 60.0f, 1.68f);
        var joao = new PessoaRecord("Joao", 70.0f, 1.75f);
        System.out.println(ana);
        System.out.println(joao);


        CalculoImc calculoImcAna = new CalculoImc(ana);
        CalculoImc calculoImcJoao = new CalculoImc(joao);

        var reportAna = new Report(ReportType.SIMPLE);
        var reportJoao = new Report(ReportType.HTML);
        var reportJoaoElaborado = new Report(ReportType.ELABORATED);

        System.out.print("Qual seu nome? ");
        String nome = scanner.nextLine();
        System.out.println();

        System.out.print("Qual sua altura? ");
        float altura = scanner.nextFloat();
        System.out.println();

        System.out.print("Qual seu peso? ");
        float peso = scanner.nextFloat();
        System.out.println();

        System.out.println("Qual report deseja? ");
        Arrays.stream(ReportType.values()).forEach(System.out::println);


        String reportType = scanner.next();

        var report = ReportType.valueOf(reportType);

        var pessoa = new PessoaRecord(nome, peso, altura);

        var reportPessoa = new Report(report);
        reportPessoa.imprimirIMC(new CalculoImc(pessoa));

        // reportAna.imprimirIMC(calculoImcAna);
        // reportJoao.imprimirIMC(calculoImcJoao);
        // reportJoaoElaborado.imprimirIMC(calculoImcJoao);

        scanner.close();
    }
}
