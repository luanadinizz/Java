package br.uff.ic.agenda.model;

import java.io.Serializable;
public class Contato implements Serializable {
    private String nome;
    private String telefone;
    private String detalhes;
    private String endc;
    private String endr;

    public Contato() {
        nome = "Novo Contato";
        telefone = "";
        detalhes = "";
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

    public String getDetalhes() {
        return detalhes;
    }

    public void setDetalhes(String detalhes) {
        this.detalhes = detalhes;
    }

    public String getEndc(){
        return endc;
    }
    public void setEndc(String detalhes) {
        this.endc = detalhes;
    }
    @Override
    public String toString() {
        return nome;
    }    
}
