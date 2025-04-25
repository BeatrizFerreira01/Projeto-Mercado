package com.example.mercado.controller;

import com.example.mercado.model.Personagem;
import com.example.mercado.service.PersonagemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import jakarta.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/personagens")
public class PersonagemController {

    @Autowired
    private PersonagemService service;

    @GetMapping
    public List<Personagem> listar() {
        return service.listarTodos();
    }

    @PostMapping
    public Personagem criar(@RequestBody @Valid Personagem personagem) {
        return service.salvar(personagem);
    }

    @GetMapping("/{id}")
    public Personagem buscar(@PathVariable Long id) {
        return service.buscarPorId(id);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        service.deletar(id);
    }

    @GetMapping("/buscar/nome")
    public List<Personagem> buscarPorNome(@RequestParam String nome) {
        return service.buscarPorNome(nome);
    }

    @GetMapping("/buscar/classe")
    public List<Personagem> buscarPorClasse(@RequestParam Personagem.Classe classe) {
        return service.buscarPorClasse(classe);
    }
}
