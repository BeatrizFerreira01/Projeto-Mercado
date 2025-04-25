package com.example.mercado.controller;

import com.example.mercado.model.Item;
import com.example.mercado.model.Item.Raridade;
import com.example.mercado.model.Item.Tipo;
import com.example.mercado.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/itens")
public class ItemController {

    @Autowired
    private ItemService service;

    @GetMapping
    public List<Item> listar() {
        return service.listarTodos();
    }

    @PostMapping
    public Item criar(@RequestBody Item item) {
        return service.salvar(item);
    }

    @GetMapping("/{id}")
    public Item buscar(@PathVariable Long id) {
        return service.buscarPorId(id);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        service.deletar(id);
    }

    @GetMapping("/buscar/nome")
    public List<Item> buscarPorNome(@RequestParam String nome) {
        return service.buscarPorNome(nome);
    }

    @GetMapping("/buscar/tipo")
    public List<Item> buscarPorTipo(@RequestParam Tipo tipo) {
        return service.buscarPorTipo(tipo);
    }

    @GetMapping("/buscar/preco")
    public List<Item> buscarPorPreco(@RequestParam double min, @RequestParam double max) {
        return service.buscarPorPreco(min, max);
    }

    @GetMapping("/buscar/raridade")
    public List<Item> buscarPorRaridade(@RequestParam Raridade raridade) {
        return service.buscarPorRaridade(raridade);
    }
}
