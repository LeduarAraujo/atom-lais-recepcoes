package br.com.devled.atom_lais_recepcoes.service;

import br.com.devled.atom_lais_recepcoes.dto.ObjetoRelatorioDTO;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;

import java.io.InputStream;
import java.util.HashMap;
import java.util.List;

public class RelatorioService {

    public byte[] gerarRelatorio(List<ObjetoRelatorioDTO> pDadosRelatorio) throws JRException {
        // Carregar o template Jasper (o arquivo .jrxml compilado para .jasper)
        InputStream jasperStream = getClass().getResourceAsStream("/relatorio_template.jasper");

        // Preparar a fonte de dados
        JRBeanCollectionDataSource dataSource = new JRBeanCollectionDataSource(pDadosRelatorio);

        // Parâmetros do relatório (como o nome do espaço, por exemplo)
        HashMap<String, Object> parametros = new HashMap<>();
        parametros.put("nmEspaco", pDadosRelatorio.get(0).getNmEspaco());

        // Preencher o relatório com os dados
        JasperPrint jasperPrint = JasperFillManager.fillReport(jasperStream, parametros, dataSource);

        // Gerar o relatório em formato PDF
        byte[] pdfRelatorio = JasperExportManager.exportReportToPdf(jasperPrint);

        return pdfRelatorio;
    }
}
