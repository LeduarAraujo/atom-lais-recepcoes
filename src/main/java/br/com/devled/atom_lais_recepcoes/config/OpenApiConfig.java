package br.com.devled.atom_lais_recepcoes.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.servers.Server;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class OpenApiConfig {

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("Lais Recepções API")
                        .description("API para gerenciamento de reservas.")
                        .version("1.0.0")
                        .contact(new Contact()
                                .name("devLed")
                                .email("contato@devLed.com")))
                .servers(List.of(
                        new Server().url("http://localhost:8080").description("Servidor de Desenvolvimento"),
                        new Server().url("http://localhost:8080").description("Servidor de Produção")
                ));
    }
}