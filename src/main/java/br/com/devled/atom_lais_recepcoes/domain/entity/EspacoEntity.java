package br.com.devled.atom_lais_recepcoes.domain.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class EspacoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String tipo;  // Tipo de espaço (Semana, Fim de semana, Feriado)
    private Double valorDiario;
    private Double taxaLimpeza;
}
