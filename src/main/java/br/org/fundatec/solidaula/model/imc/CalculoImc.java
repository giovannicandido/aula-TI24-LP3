package br.org.fundatec.solidaula.model.imc;

public class CalculoImc {
    private final PessoaRecord pessoa;

    public CalculoImc(PessoaRecord pessoa) {
        this.pessoa = pessoa;
    }

    public float calcular() {
        return pessoa.peso() / (pessoa.altura() * pessoa.altura());
    }

    public String getNomePessoa() {
        return this.pessoa.nome();
    }

    public String classificar() {
        var imc = calcular();
        // Bug de arredondamento.
        if(imc < 17) {
            return "Muito abaixo do peso";
        } else if(imc <= 18.49) {
            return "Abaixo do peso";
        } else if(imc <= 24.99) {
            return "Peso normal";
        } else if(imc <= 29.99) {
            return "Sobrepeso";
        } else if(imc <= 34.99) {
            return "Obesidade";
        } else if (imc <= 39.99) {
            return "Obesidade grave";
        } else {
            return "Obesidade morbida";
        }
    }
}
