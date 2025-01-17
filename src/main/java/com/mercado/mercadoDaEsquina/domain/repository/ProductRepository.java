package com.mercado.mercadoDaEsquina.domain.repository;

import com.mercado.mercadoDaEsquina.domain.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
}
