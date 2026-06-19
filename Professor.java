package com.sistema.ocorrencias.model;

public class Professor {

    private Long id;
    private String nome;
    private String email;
    private String materia;

    public Professor() {}

    public Professor(Long id, String nome, String email, String materia) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.materia = materia;
    }

    // Getters e Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getMateria() { return materia; }
    public void setMateria(String materia) { this.materia = materia; }
}