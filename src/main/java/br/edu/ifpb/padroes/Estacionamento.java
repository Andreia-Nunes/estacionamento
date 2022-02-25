package br.edu.ifpb.padroes;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
public class Estacionamento {

    private LocalDateTime entrada;
    private LocalDateTime saida;
    private Veiculo veiculo;

    public Estacionamento(){

    }

    public BigDecimal obterTotalAPagar() {
        assert(entrada != null && saida != null && veiculo != null);
         return CalculadoraTotal.calcularTotal(entrada, saida);

    }

}
