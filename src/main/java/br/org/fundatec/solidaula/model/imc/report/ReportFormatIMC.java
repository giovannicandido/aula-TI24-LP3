package br.org.fundatec.solidaula.model.imc.report;

import br.org.fundatec.solidaula.model.imc.CalculoImc;

public interface ReportFormatIMC {
    String format(CalculoImc calculoImc);
}
