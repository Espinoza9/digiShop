package br.com.digix.digishop.model.cliente;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Cliente {
    private String cpf;
    private String nome;
    private String rua;
    private String email;
    private String telefone;

    public Cliente(String cpf, String nome, String rua, String email, String telefone) {
        this.cpf = cpf;
        this.nome = nome;
        this.rua = rua;
        this.email = email;
        this.telefone = telefone;
    }
    

}
