package com.example.mercado.repository;

import com.example.mercado.model.Personagem;
import com.example.mercado.model.Personagem.Classe;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface PersonagemRepository extends JpaRepository<Personagem, Long> {
    List<Personagem> findByNomeContainingIgnoreCase(String nome);
    List<Personagem> findByClasse(Classe classe);
}
