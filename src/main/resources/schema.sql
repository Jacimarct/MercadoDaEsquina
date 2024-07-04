CREATE TABLE IF NOT EXISTS cliente (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    endereco VARCHAR(255) NOT NULL,
    cidade VARCHAR(255) NOT NULL
);

CREATE TABLE IF NOT EXISTS product (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    price DECIMAL(10, 2) NOT NULL,
    unit VARCHAR(50) NOT NULL -- exemplo: 'kg' ou 'unidade'
);

--CREATE TABLE IF NOT EXISTS compra (
--    id BIGINT AUTO_INCREMENT PRIMARY KEY,
----    cliente_id BIGINT NOT NULL,
--    product_id BIGINT NOT NULL,
--    quantidade INT NOT NULL,
--    data_compra DATE NOT NULL,
----    FOREIGN KEY (cliente_id) REFERENCES cliente(id),
----    FOREIGN KEY (product_id) REFERENCES product(id)
--);




---- src/main/resources/schema.sql
--CREATE TABLE IF NOT EXISTS tb_produto (
--    id BIGINT AUTO_INCREMENT PRIMARY KEY,
--    nome VARCHAR(255) NOT NULL,
--    preco DECIMAL(10, 2) NOT NULL,
--    medida VARCHAR(255) NOT NULL
--);
--
--CREATE TABLE IF NOT EXISTS tb_cliente (
--    id BIGINT AUTO_INCREMENT PRIMARY KEY,
--    nome VARCHAR(255) NOT NULL,
--    endereco VARCHAR(255) NOT NULL,
--    cidade VARCHAR(255) NOT NULL
--);
--
--CREATE TABLE IF NOT EXISTS tb_compra (
--    id BIGINT AUTO_INCREMENT PRIMARY KEY,
--    cliente_id BIGINT NOT NULL,
--    produto_id BIGINT NOT NULL,
--    quantidade INT NOT NULL,
--    data_compra DATE NOT NULL,
--    FOREIGN KEY (cliente_id) REFERENCES cliente(id),
--    FOREIGN KEY (produto_id) REFERENCES produto(id)
--);


-- src/main/resources/schema.sql
--CREATE TABLE IF NOT EXISTS tb_produto (
--    id BIGINT AUTO_INCREMENT PRIMARY KEY,
--    nome VARCHAR(255) NOT NULL,
--    preco DECIMAL(10, 2) NOT NULL,
--    medida VARCHAR(255) NOT NULL
--);
--
--CREATE TABLE IF NOT EXISTS tb_cliente (
--    id BIGINT AUTO_INCREMENT PRIMARY KEY,
--    nome VARCHAR(255) NOT NULL,
--    endereco VARCHAR(255) NOT NULL,
--    cidade VARCHAR(255) NOT NULL
--);
--
--CREATE TABLE IF NOT EXISTS tb_compra (
--    id BIGINT AUTO_INCREMENT PRIMARY KEY,
--    cliente_id BIGINT NOT NULL,
--    produto_id BIGINT NOT NULL,
--    quantidade INT NOT NULL,
--    data_compra DATE NOT NULL,
--    FOREIGN KEY (cliente_id) REFERENCES cliente(id),
--    FOREIGN KEY (produto_id) REFERENCES produto(id)
--);
