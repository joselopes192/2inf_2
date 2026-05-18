package com.eeep.ocorrencia.model;

public class Aluno {

    private Integer numero;
    private String nome;
    private String sexo;

    public Aluno() {
    }

    public Aluno(Integer numero, String nome, String sexo) {
        this.numero = numero;
        this.nome = nome;
        this.sexo = sexo;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
}
