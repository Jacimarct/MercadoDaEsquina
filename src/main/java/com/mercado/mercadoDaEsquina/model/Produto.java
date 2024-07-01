package com.mercado.mercadoDaEsquina.model;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity(name = "tb_produto")
public class Produto {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private BigDecimal preco;
    private String quantidade;


    @OneToOne(cascade = CascadeType.ALL)
    private Fruta fruta;

    @OneToOne(cascade = CascadeType.ALL)
    private Verdura verdura;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

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

    public String getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(String quantidade) {
        this.quantidade = quantidade;
    }

    public Fruta getFruta() {
        return fruta;
    }

    public void setFruta(Fruta fruta) {
        this.fruta = fruta;
    }

    public Verdura getVerdura() {
        return verdura;
    }

    public void setVerdura(Verdura verdura) {
        this.verdura = verdura;
    }

    // Getters e Setters
}
