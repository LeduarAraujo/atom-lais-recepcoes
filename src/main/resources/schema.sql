-- Tabela de Clientes
CREATE TABLE clientes (
    id SERIAL PRIMARY KEY,
    nome_completo VARCHAR(255) NOT NULL,
    telefone VARCHAR(15) NOT NULL,
    cpf_cnpj VARCHAR(20) UNIQUE NOT NULL
);

-- Tabela de Espaços de Festa
CREATE TABLE espacos (
    id SERIAL PRIMARY KEY,
    nome VARCHAR(255) NOT NULL,
    tipo VARCHAR(50) CHECK (tipo IN ('Semana', 'Final de Semana', 'Feriado')) NOT NULL,
    valor_diario DECIMAL(10, 2) NOT NULL,
    taxa_limpeza DECIMAL(10, 2) DEFAULT 0.00
);

-- Tabela de Reservas
CREATE TABLE reservas (
    id SERIAL PRIMARY KEY,
    cliente_id INT NOT NULL,
    espaco_id INT NOT NULL,
    data_inicio TIMESTAMP NOT NULL,
    data_fim TIMESTAMP NOT NULL,
    horas_extras INT DEFAULT 0,
    valor_pago DECIMAL(10, 2) NOT NULL,
    status_pagamento VARCHAR(20) CHECK (status_pagamento IN ('Integral', '50%')) NOT NULL,
    FOREIGN KEY (cliente_id) REFERENCES clientes(id),
    FOREIGN KEY (espaco_id) REFERENCES espacos(id)
);

-- Tabela de Pagamentos
CREATE TABLE pagamentos (
    id SERIAL PRIMARY KEY,
    reserva_id INT NOT NULL,
    data_pagamento TIMESTAMP NOT NULL,
    valor DECIMAL(10, 2) NOT NULL,
    tipo_pagamento VARCHAR(50) CHECK (tipo_pagamento IN ('Dinheiro', 'Cartão', 'PIX')) NOT NULL,
    FOREIGN KEY (reserva_id) REFERENCES reservas(id)
);

-- Tabela para Relatórios Semanais (caso precise gerar)
CREATE TABLE relatorios_semanais (
    id SERIAL PRIMARY KEY,
    semana_inicio DATE NOT NULL,
    semana_fim DATE NOT NULL,
    espaco_id INT NOT NULL,
    reservas_count INT NOT NULL,
    FOREIGN KEY (espaco_id) REFERENCES espacos(id)
);
