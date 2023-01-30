package br.com.teste.java.io.teste;


import java.io.Serializable;

/**
 * Classe que representa um cliente no Bytebank.
 *
 * @author definitivamente alguém

 */
  public class Cliente implements Serializable {
    private static final long serialVersionUID = 1055L;

    private String nome;
    private String cpf;
    private String profissao;

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public String getProfissao() {
        return profissao;
    }
    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

}
