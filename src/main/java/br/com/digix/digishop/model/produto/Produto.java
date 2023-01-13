package br.com.digix.digishop.model.produto;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Produto {
    private String tema;
    private String descricao;
    private String imagem;
   
    public Produto(String tema, String descricao, String imagem) {
        this.tema = tema;
        this.descricao = descricao;
        this.imagem = imagem;
    }
 

    
}
