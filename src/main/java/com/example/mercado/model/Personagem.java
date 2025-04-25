package com.example.mercado.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import java.util.List;

@Entity
public class Personagem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nome;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Classe classe;

    @Min(1)
    @Max(99)
    @Column(nullable = false)
    private int nivel;

    @Column(nullable = false)
    private double moedas;

    @OneToMany(mappedBy = "dono", cascade = CascadeType.ALL)
    private List<Item> itens;

    public enum Classe {
        GUERREIRO, MAGO, ARQUEIRO
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Classe getClasse() {
        return classe;
    }

    public void setClasse(Classe classe) {
        this.classe = classe;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public double getMoedas() {
        return moedas;
    }

    public void setMoedas(double moedas) {
        this.moedas = moedas;
    }

    public List<Item> getItens() {
        return itens;
    }

    public void setItens(List<Item> itens) {
        this.itens = itens;
    }
    
}
