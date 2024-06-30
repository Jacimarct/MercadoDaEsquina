package com.mercado.mercadoDaEsquina.model;

import jakarta.persistence.Entity;

@Entity
public class Verdura extends Produto {
    private Double precoPorKilo;
    private Double precoPorUnidade;

    public Double getPrecoPorKilo() {
        return precoPorKilo;
    }

    public void setPrecoPorKilo(Double precoPorKilo) {
        this.precoPorKilo = precoPorKilo;
    }

    public Double getPrecoPorUnidade() {
        return precoPorUnidade;
    }

    public void setPrecoPorUnidade(Double precoPorUnidade) {
        this.precoPorUnidade = precoPorUnidade;
    }

    // Getters e Setters
}
