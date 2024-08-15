package br.org.fundatec.solidaula.controller;

import br.org.fundatec.solidaula.model.Carro;
import br.org.fundatec.solidaula.model.Forca;

public class DigirirController {
    private boolean notWin = true;

    public void digirirNaPista(Carro carro) {
        while(notWin) {
            carro.acelerar(Forca.PESADA);
        }

    }

    public void digirCidade(Carro carro) {
        carro.abrirPorta();
        carro.fecharPorta();
        carro.acelerar(Forca.LEVE);
        carro.acelerar(Forca.NORMAL);
        carro.frear(Forca.LEVE);

        carro.ligarArcondicionado();

        carro.acelerar(Forca.NORMAL);

    }
}
