package br.com.devled.atom_lais_recepcoes.repository;

import br.com.devled.atom_lais_recepcoes.domain.entity.Espaco;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EspacoRepository extends JpaRepository<Espaco, Long> {
    List<Espaco> findByTipo(String tipo);
}
