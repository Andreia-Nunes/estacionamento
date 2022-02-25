package br.edu.ifpb.padroes;

import java.math.BigDecimal;

public class Calculadora_Por_Diaria implements CalculadoraEstacionamento {

    public Calculadora_Por_Diaria(){

    }

    @java.lang.Override
    public BigDecimal calculaTotal(long periodo, BigDecimal valor) {
        return valor.multiply(new BigDecimal(periodo));

    }
}
