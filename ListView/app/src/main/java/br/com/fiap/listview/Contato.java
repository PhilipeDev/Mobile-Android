package br.com.fiap.listview;

import java.io.Serializable;

public class Contato implements Serializable{

    private String nome;
    private String telefone;
    private String sobre;
    private int img;

    public Contato() {
    }

    public Contato(String nome, String telefone, String sobre, int img) {
        setNome(nome);
        setTelefone(telefone);
        setSobre(sobre);
        setImg(img);
    }

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
    public String getSobre() {
        return sobre;
    }
    public void setSobre(String sobre) {
        this.sobre = sobre;
    }
    public int getImg() {
        return img;
    }
    public void setImg(int img) {
        this.img = img;
    }
}
