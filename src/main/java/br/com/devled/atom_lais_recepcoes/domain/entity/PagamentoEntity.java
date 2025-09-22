package br.com.devled.atom_lais_recepcoes.domain.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PagamentoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private ReservaEntity reserva;

    private LocalDateTime dataPagamento;
    private Double valor;
    private String tipoPagamento;  // Dinheiro, Cartão, Transferência
}
