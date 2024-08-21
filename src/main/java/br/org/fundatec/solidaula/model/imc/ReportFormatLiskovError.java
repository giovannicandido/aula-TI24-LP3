package br.org.fundatec.solidaula.model.imc;

public class ReportFormatLiskovError extends ReportFormatLiskov {

    @Override
    Pessoa calcularIMC(Pessoa pessoa) {
        var calculo = -10;
        pessoa.imc = calculo;
        return pessoa;
    }

}
