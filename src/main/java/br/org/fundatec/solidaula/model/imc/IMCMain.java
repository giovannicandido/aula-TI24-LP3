package br.org.fundatec.solidaula.model.imc;

public class IMCMain {
    public static void main(String[] args) {
        var ana = new PessoaRecord("Ana", 60.0f, 1.68f);
        var joao = new PessoaRecord("Joao", 70.0f, 1.75f);
        System.out.println(ana);
        System.out.println(joao);


        CalculoImc calculoImcAna = new CalculoImc(ana);
        CalculoImc calculoImcJoao = new CalculoImc(joao);
        imprimirIMC(calculoImcAna);
        imprimirIMC(calculoImcJoao);
    }

    public static void imprimirIMC(CalculoImc calculoImc) {
        System.out.printf("Resultado imc %s: %.2f. Classificação %s", calculoImc.getNomePessoa(),
                calculoImc.calcular(), calculoImc.classificar());
        System.out.println();
    }
}
