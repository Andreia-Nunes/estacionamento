package br.edu.ifpb.padroes;

import java.math.BigDecimal;

public interface CalculadoraEstacionamento {

    public BigDecimal calculaTotal(long periodo, BigDecimal valor);

}
