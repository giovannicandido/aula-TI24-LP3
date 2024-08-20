package br.org.fundatec.solidaula.model.carro;

import java.util.Arrays;

public class Carro {

    private double velocidade;
    private double velocidadeMaxima;
    private TanqueCombustivel tanqueCombustivel;
    private Motor motor = new Motor(tanqueCombustivel);

    private static final Roda[] rodas = {new Roda(), new Roda(), new Roda(), new Roda()};

    public void acelerar(Forca forca) {

        if(velocidade < velocidadeMaxima) {
            velocidade = motor.fazerAceleracao(forca, velocidade);
        }

    }

    public void frear(Forca forca) {
        Arrays.stream(rodas)
                .forEach(r -> r.frear(forca));
    }

    public void abrirPorta() {}

    public void fecharPorta() {}

    public void ligarLimpador() {}

    public void desligarLimpador() {}

    public void ligarArcondicionado() {}

    public void ligarPiscaAlerta() {

    }

    public void ligarAlarme() {
    }


}
