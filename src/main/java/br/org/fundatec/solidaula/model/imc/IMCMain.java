package br.org.fundatec.solidaula.model.imc;

public class IMCMain {
    public static void main(String[] args) {
        var ana = new Pessoa("Ana", 60.0f, 1.68f);
        var joao = new PessoaRecord("Joao", 70.0f, 1.75f);
        System.out.println(ana);
        System.out.println(joao);


        CalculoImc calculoImc = new CalculoImc();
        var resultado = calculoImc.calcular(82.0f, 1.75f);
        System.out.printf("Resultado imc: %.2f", resultado);
        var classificacao = calculoImc.classificar(resultado);
        System.out.printf("Classificacao imc: %s", classificacao);
    }
}
