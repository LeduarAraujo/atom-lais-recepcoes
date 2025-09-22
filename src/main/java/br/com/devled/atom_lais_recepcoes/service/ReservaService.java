package br.com.devled.atom_lais_recepcoes.service;

import br.com.devled.atom_lais_recepcoes.domain.entity.ReservaEntity;
import br.com.devled.atom_lais_recepcoes.repository.ReservaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class ReservaService {

    @Autowired
    private ReservaRepository reservaRepository;

    public List<ReservaEntity> getReservas() {
        return reservaRepository.findAll();
    }

    public ReservaEntity criarReserva(ReservaEntity reserva) {
        return reservaRepository.save(reserva);
    }

    public List<ReservaEntity> getReservasPorEspaco(Long espacoId, LocalDateTime start, LocalDateTime end) {
        return reservaRepository.findByEspacoIdAndDataInicioBetween(espacoId, start, end);
    }
}
