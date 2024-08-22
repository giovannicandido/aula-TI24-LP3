package br.org.fundatec.solidaula.model.imc;

import br.org.fundatec.solidaula.model.imc.report.Report;
import br.org.fundatec.solidaula.model.imc.report.ReportFormatFabric;
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

        var reportAna = new Report(ReportFormatFabric.build(ReportType.SIMPLE));
        var reportJoao = new Report(ReportFormatFabric.build(ReportType.HTML));
        var reportJoaoElaborado = new Report(ReportFormatFabric.build(ReportType.ELABORATED));

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

        PessoaRecord pessoa = new PessoaRecord(nome, peso, altura);
        var reportFormat = ReportFormatFabric.build(report);
        var reportPessoa = new Report(reportFormat);
        reportPessoa.imprimirIMC(new CalculoImc(pessoa));

        // reportAna.imprimirIMC(calculoImcAna);
        // reportJoao.imprimirIMC(calculoImcJoao);
        // reportJoaoElaborado.imprimirIMC(calculoImcJoao);
        ReportFormatLiskov formatLiskov = new ReportFormatLiskov();
        formatLiskov = new ReportFormatLiskovError();
        //

        Pessoa pessoaLiskov = new Pessoa("Teste", 50, 1.27f);
        Pessoa pessoaComIMC = formatLiskov.calcularIMC(pessoaLiskov);

        if(pessoaComIMC.imc < 0) {
            throw new RuntimeException("Algo de errado");
        }

        System.out.println("Finalizado com sucesso: " + pessoaComIMC.imc);

        scanner.close();


    }
}
