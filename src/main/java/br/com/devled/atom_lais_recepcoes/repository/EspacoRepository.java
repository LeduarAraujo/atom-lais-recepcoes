package br.com.devled.atom_lais_recepcoes.repository;

import br.com.devled.atom_lais_recepcoes.domain.entity.EspacoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EspacoRepository extends JpaRepository<EspacoEntity, Long> {
    List<EspacoEntity> findByTipo(String tipo);
}
