package com.mercado.mercadoDaEsquina.repository;

import com.mercado.mercadoDaEsquina.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
}
