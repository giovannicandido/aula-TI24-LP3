package br.org.fundatec.solidaula.model.imc;

public class CalculoImc {

    public float calcular(float peso, float altura) {
        return peso / (altura * altura);
    }

    public String classificar(float imc) {
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
