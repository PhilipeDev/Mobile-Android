package br.com.fiap.exemplorecyclerview.beans;

import java.io.Serializable;

public class Contato implements Serializable{
    private String nome;
    private String telefone;
    private String status;
    private int imagem;

    public Contato(String nome, String telefone, String status, int imagem) {
        setNome(nome);
        setTelefone(telefone);
        setStatus(status);
        setImagem(imagem);
    }

    public Contato() {
    }

    //GETTER'S AND SETTER'S
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getImagem() {
        return imagem;
    }

    public void setImagem(int imagem) {
        this.imagem = imagem;
    }
}
