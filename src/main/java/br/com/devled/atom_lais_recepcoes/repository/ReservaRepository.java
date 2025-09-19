package br.com.devled.atom_lais_recepcoes.repository;

import br.com.devled.atom_lais_recepcoes.domain.entity.Reserva;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDateTime;
import java.util.List;

public interface ReservaRepository extends JpaRepository<Reserva, Long> {
    List<Reserva> findByEspacoIdAndDataInicioBetween(Long espacoId, LocalDateTime start, LocalDateTime end);
}
