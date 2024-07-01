package com.mercado.mercadoDaEsquina.model;

import jakarta.persistence.*;

import java.math.BigDecimal;


@MappedSuperclass
public abstract class xxxx_BaseItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String nome;

    @Column(precision = 9, scale = 2)
    private BigDecimal preco;

    @Column(length = 20)
    private String quantidade;

    public BigDecimal getPreco() {
        return preco;
    }

    public void setPreco(BigDecimal preco) {
        this.preco = preco;
    }

    public String getMe() {
        return quantidade;
    }

    public void setQuantidade(String quantidade) {
        this.quantidade = quantidade;
    }





}
