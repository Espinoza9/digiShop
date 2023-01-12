package br.com.digix.digishop.model.endereco;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Endereco {
    String rua;
    String bairro;
    String numero;
    String cep;
    String cidade;  
    String estado;

    public Endereco(String rua, String bairro, String numero, String cep, String cidade, String estado) {
        this.rua = rua;
        this.bairro = bairro;
        this.numero = numero;
        this.cep = cep;
        this.cidade = cidade;
        this.estado = estado;
    }

 
}
