package br.edu.ifpb.padroes;

import java.math.BigDecimal;

public class Calculadora_Por_Hora implements CalculadoraEstacionamento {

    public Calculadora_Por_Hora(){

    }

    @java.lang.Override
    public BigDecimal calculaTotal(long periodo, BigDecimal valor) {

        BigDecimal total = valor.multiply(new BigDecimal(periodo));

        return total;
    }
}
