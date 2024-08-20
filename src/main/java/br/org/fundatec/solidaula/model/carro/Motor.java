package br.org.fundatec.solidaula.model.carro;

public class Motor {
    private TanqueCombustivel tanqueCombustivel;
    public Motor(TanqueCombustivel tanqueCombustivel) {
        this.tanqueCombustivel = tanqueCombustivel;
    }
    double fazerAceleracao(Forca forca, double velocidateAtual) {
        // remover os ifs pois tá ruim
        if (forca == Forca.LEVE) {
            double gasolina = tanqueCombustivel.getGasolina();
            // usa a gasolina
            return velocidateAtual + 20;
        } else if (forca == Forca.NORMAL) {
            double gasolina = tanqueCombustivel.getGasolina();
            // usa a gasolina
            return velocidateAtual + 40;
        } else if (forca == Forca.PESADA) {
            double gasolina = tanqueCombustivel.getGasolina();
            // usa a gasolina
            return velocidateAtual + 60;
        }
        return 0;
    }
}