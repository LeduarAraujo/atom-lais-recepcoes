package br.com.devled.atom_lais_recepcoes.repository;

import br.com.devled.atom_lais_recepcoes.domain.entity.Pagamento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PagamentoRepository extends JpaRepository<Pagamento, Long> {
}
