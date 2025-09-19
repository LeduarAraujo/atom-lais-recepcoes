package br.com.devled.atom_lais_recepcoes.dto;

import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
public class ObjetoRelatorioDTO {
    String nmEspaco;
    String nmCliente;
    LocalDateTime dhInicio;
    LocalDateTime dhTermino;
    String telContato;
    BigDecimal vlPago;
    BigDecimal vlRestante;
    String formaPagamento;
}
