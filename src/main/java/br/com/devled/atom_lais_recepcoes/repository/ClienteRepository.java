package br.com.devled.atom_lais_recepcoes.repository;

import br.com.devled.atom_lais_recepcoes.domain.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
    Optional<Cliente> findByCpfCnpj(String cpfCnpj);
}

