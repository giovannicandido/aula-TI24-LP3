package br.org.fundatec.solidaula.model.carro;

public class Roda {

    public void frear(Forca forca) {
        // remover os ifs pois tá ruim
        if(forca == Forca.LEVE) {
            System.out.println("Aplicando freagem leve");
        } else if(forca == Forca.NORMAL) {
            System.out.println("Aplicando freagem normal");
        } else if(forca == Forca.PESADA) {
            System.out.println("Aplicando freagem pesada");
        }
    }
}
