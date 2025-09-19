package br.com.devled.atom_lais_recepcoes.web.controller;

import br.com.devled.atom_lais_recepcoes.dto.ObjetoRelatorioDTO;
import br.com.devled.atom_lais_recepcoes.service.RelatorioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/relatorio")
public class RelatorioController {

    @Autowired
    private RelatorioService relatorioService;

    @PostMapping("/gerar")
    public ResponseEntity<byte[]> gerarRelatorio(@RequestBody List<ObjetoRelatorioDTO> pDadosRelatorio) throws Exception {
        byte[] pdfRelatorio = relatorioService.gerarRelatorio(pDadosRelatorio);

        return ResponseEntity.ok()
                .header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=relatorio.pdf")
                .contentType(MediaType.APPLICATION_PDF)
                .body(pdfRelatorio);
    }
}
