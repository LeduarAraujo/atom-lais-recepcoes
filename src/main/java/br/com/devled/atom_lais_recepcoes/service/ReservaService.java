package br.com.devled.atom_lais_recepcoes.service;

import br.com.devled.atom_lais_recepcoes.domain.entity.Reserva;
import br.com.devled.atom_lais_recepcoes.repository.ReservaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class ReservaService {

    @Autowired
    private ReservaRepository reservaRepository;

    public List<Reserva> getReservas() {
        return reservaRepository.findAll();
    }

    public Reserva criarReserva(Reserva reserva) {
        return reservaRepository.save(reserva);
    }

    public List<Reserva> getReservasPorEspaco(Long espacoId, LocalDateTime start, LocalDateTime end) {
        return reservaRepository.findByEspacoIdAndDataInicioBetween(espacoId, start, end);
    }
}
