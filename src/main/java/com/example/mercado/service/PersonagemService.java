package com.example.mercado.service;

import com.example.mercado.model.Personagem;
import com.example.mercado.repository.PersonagemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class PersonagemService {

    @Autowired
    private PersonagemRepository repository;

    public List<Personagem> listarTodos() {
        return repository.findAll();
    }

    public Personagem salvar(Personagem personagem) {
        return repository.save(personagem);
    }

    public Personagem buscarPorId(Long id) {
        return repository.findById(id).orElse(null);
    }

    public void deletar(Long id) {
        repository.deleteById(id);
    }

    public List<Personagem> buscarPorNome(String nome) {
        return repository.findByNomeContainingIgnoreCase(nome);
    }

    public List<Personagem> buscarPorClasse(Personagem.Classe classe) {
        return repository.findByClasse(classe);
    }
}
