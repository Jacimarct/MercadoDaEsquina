package com.mercado.mercadoDaEsquina.controller;

import com.mercado.mercadoDaEsquina.model.Produto;
import com.mercado.mercadoDaEsquina.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/produtos")
public class ProdutoController {
    @Autowired
    private ProdutoService produtoService;

    @GetMapping
    public List<Produto> getAllProdutos() {
        return produtoService.getAllProdutos();
    }

    @GetMapping("/{id}")
    public Produto getProdutoById(@PathVariable Long id) {
        return produtoService.getProdutoById(id);
    }

    @PostMapping
    public Produto createProduto(@RequestBody Produto produto) {
        return produtoService.saveProduto(produto);
    }

    @PutMapping("/{id}")
    public Produto updateProduto(@PathVariable Long id, @RequestBody Produto produto) {
        Produto existingProduto = produtoService.getProdutoById(id);
        if (existingProduto != null) {
            existingProduto.setNome(produto.getNome());
            existingProduto.setPreco(produto.getPreco());
            existingProduto.setUnidade(produto.getUnidade());
            return produtoService.saveProduto(existingProduto);
        } else {
            return null;
        }
    }

    @DeleteMapping("/{id}")
    public void deleteProduto(@PathVariable Long id) {
        produtoService.deleteProduto(id);
    }
}