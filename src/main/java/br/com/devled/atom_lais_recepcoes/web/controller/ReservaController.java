package br.com.devled.atom_lais_recepcoes.web.controller;

import br.com.devled.atom_lais_recepcoes.domain.entity.Reserva;
import br.com.devled.atom_lais_recepcoes.service.ReservaService;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/reservas")
public class ReservaController {

    @Autowired
    private ReservaService reservaService;

    @Operation(summary = "Listar todas as reservas")
    @GetMapping
    public List<Reserva> listarReservas() {
        return reservaService.getReservas();
    }

    @Operation(summary = "Criar uma nova reserva")
    @PostMapping
    public ResponseEntity<Reserva> criarReserva(@RequestBody Reserva reserva) {
        Reserva novaReserva = reservaService.criarReserva(reserva);
        return ResponseEntity.ok(novaReserva);
    }
}

