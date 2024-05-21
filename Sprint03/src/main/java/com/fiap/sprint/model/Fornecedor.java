package com.fiap.sprint.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Fornecedor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long fornecedorId;
    private String nome;
    private String enderecoURL;
    private String contato;

    public Long getId() {
        return fornecedorId;
    }

    public void setId(Long fornecedorId) {
        this.fornecedorId = fornecedorId;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEnderecoURL() {
        return enderecoURL;
    }

    public void setEnderecoURL(String enderecoURL) {
        this.enderecoURL = enderecoURL;
    }

    public String getContato() {
        return contato;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }
}
