package com.example.mercado.service;

import com.example.mercado.model.Item;
import com.example.mercado.model.Item.Raridade;
import com.example.mercado.model.Item.Tipo;
import com.example.mercado.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ItemService {

    @Autowired
    private ItemRepository repository;

    public List<Item> listarTodos() {
        return repository.findAll();
    }

    public Item salvar(Item item) {
        return repository.save(item);
    }

    public Item buscarPorId(Long id) {
        return repository.findById(id).orElse(null);
    }

    public void deletar(Long id) {
        repository.deleteById(id);
    }

    public List<Item> buscarPorNome(String nome) {
        return repository.findByNomeContainingIgnoreCase(nome);
    }

    public List<Item> buscarPorTipo(Tipo tipo) {
        return repository.findByTipo(tipo);
    }

    public List<Item> buscarPorPreco(double min, double max) {
        return repository.findByPrecoBetween(min, max);
    }

    public List<Item> buscarPorRaridade(Raridade raridade) {
        return repository.findByRaridade(raridade);
    }
}
