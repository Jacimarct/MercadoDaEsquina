package com.mercado.mercadoDaEsquina.model;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity(name = "tb_produto")
//@MappedSuperclass
public abstract class Produto {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        @Column(length = 100)
        private String nome;

        @Column(precision = 9, scale = 2)
        private BigDecimal preco;

        @Column(length = 20)
        private String medida;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public BigDecimal getPreco() {
            return preco;
        }

        public void setPreco(BigDecimal preco) {
            this.preco = preco;
        }

        public String getMedida() {
            return medida;
        }

        public void setMedida(String medida) {
            this.medida = medida;
        }
    }
