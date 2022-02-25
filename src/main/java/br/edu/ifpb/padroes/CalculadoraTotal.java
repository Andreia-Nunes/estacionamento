package br.edu.ifpb.padroes;

import java.math.BigDecimal;
import java.time.Duration;
import java.time.LocalDateTime;

public class CalculadoraTotal {

    public static BigDecimal VALOR_HORA = new BigDecimal("2.00");
    public static BigDecimal VALOR_DIARIA = new BigDecimal("26.00");
    public static BigDecimal VALOR_MENSALIDADE = new BigDecimal("300.00");

    private static final Calculadora_Por_Hora calculadoraHora = new Calculadora_Por_Hora();
    private static final Calculadora_Por_Diaria calculadoraDiaria = new Calculadora_Por_Diaria();

    public static BigDecimal calcularTotal(LocalDateTime entrada, LocalDateTime saida){
        long totalHoras = Duration.between(entrada, saida).toHours();
        long totalDias = Duration.between(entrada,saida).toDays();
        BigDecimal total;

        if(totalHoras < 12){
            total = CalculadoraTotal.calculadoraHora.calculaTotal(totalHoras, VALOR_HORA);
        }else if(totalDias < 15){
            total = CalculadoraTotal.calculadoraDiaria.calculaTotal(totalDias, VALOR_DIARIA);
        }else{
            total = VALOR_MENSALIDADE;
        }

        return total;
    }

}
