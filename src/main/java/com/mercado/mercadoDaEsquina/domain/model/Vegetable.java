package com.mercado.mercadoDaEsquina.domain.model;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("VEGETABLE")
public class Vegetable extends Product {
    // Atributos específicos para Verduras (se houver)
}
