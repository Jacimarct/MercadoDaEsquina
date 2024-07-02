package com.mercado.mercadoDaEsquina.domain.model;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("FRUIT")
public class Fruit extends Product {
    // Atributos específicos para Frutas (se houver)
}
