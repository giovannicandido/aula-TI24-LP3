package br.org.fundatec.solidaula.model.imc;

public class CalculoImc {

    public float calcular(float peso, float altura) {
        return peso / (altura * altura);
    }

    public String classificar(float imc) {
        if(imc < 18.5) {
            return "Abaixo do peso";
        } else if(imc < 24.9) {
            return "Peso normal";
        } else if(imc < 29.9) {
            return "Sobrepeso";
        } else if(imc < 34.9) {
            return "Obesidade";
        } else if (imc >= 40.0) {
            return "Obesidade grave";
        }
        throw new RuntimeException("Não pode calcular");
    }
}
