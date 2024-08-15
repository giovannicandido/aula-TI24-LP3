package br.org.fundatec.solidaula.model;

public class Carro {

    private double velocidade;
    private double velocidadeMaxima;
    private TanqueCombustivel tanqueCombustivel;
    private Motor motor = new Motor(tanqueCombustivel);

    public void acelerar(Forca forca) {

        if(velocidade < velocidadeMaxima) {
            velocidade = motor.fazerAceleracao(forca, velocidade);
        }

    }

    public void frear(Forca forca) {
        // remover os ifs pois tá ruim
        if(forca == Forca.LEVE) {
            velocidade -= 20;
        } else if(forca == Forca.NORMAL) {
            velocidade -= 40;
        } else if(forca == Forca.PESADA) {
            velocidade -= 60;
        }
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
