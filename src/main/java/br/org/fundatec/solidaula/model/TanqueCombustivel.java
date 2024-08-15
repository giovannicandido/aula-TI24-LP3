package br.org.fundatec.solidaula.model;

public class TanqueCombustivel {
    double litros;
    double getGasolina() {
        litros -= 1;
        return 1;
    }
}
