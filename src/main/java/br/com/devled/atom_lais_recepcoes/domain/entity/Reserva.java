package br.com.devled.atom_lais_recepcoes.domain.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Reserva {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Cliente cliente;

    @ManyToOne
    private Espaco espaco;

    private LocalDateTime dataInicio;
    private LocalDateTime dataFim;
    private Integer horasExtras;
    private BigDecimal valorPago;
    private String statusPagamento;

    // Getters e Setters
}
