package com.example.mercado.repository;

import com.example.mercado.model.Item;
import com.example.mercado.model.Item.Raridade;
import com.example.mercado.model.Item.Tipo;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface ItemRepository extends JpaRepository<Item, Long> {
    List<Item> findByNomeContainingIgnoreCase(String nome);
    List<Item> findByTipo(Tipo tipo);
    List<Item> findByPrecoBetween(double min, double max);
    List<Item> findByRaridade(Raridade raridade);
}
