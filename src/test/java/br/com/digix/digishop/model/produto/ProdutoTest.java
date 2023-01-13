package br.com.digix.digishop.model.produto;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;



public class ProdutoTest {

    @Test
    void deve_criar_um_produto(){
        String tema = "Marvel";
        String descricao = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Etiam sodales ligula a euismod finibus. Proin non elit luctus, dapibus enim sit amet, egestas est.";
        String imagem = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Etiam sodales ligula a euismod finibus. Proin non elit luctus, dapibus enim sit amet, egestas est";

        Produto box =  new Produto(tema, descricao, imagem);

        assertEquals(tema, box.getTema());
        assertEquals(descricao, box.getDescricao());
        assertEquals(imagem, box.getImagem());
    }


}
