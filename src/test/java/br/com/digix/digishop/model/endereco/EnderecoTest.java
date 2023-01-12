package br.com.digix.digishop.model.endereco;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import br.com.digix.digishop.model.endereco.Endereco;
import lombok.Getter;
import lombok.Setter;


@Getter @Setter
@SpringBootTest
class EnderecoTest{

@Test
void deve_criar_um_endereco(){
    //arranger
    String rua="rui barbosa";
    String bairro="vilas boas";
    String numero="310";
    String cep="79073251";
    String cidade="campo grande";  
    String estado="ms";
    
    //act
    Endereco endereco = new Endereco(rua,bairro,numero,cep,cidade,estado);

    //ASSERT
   assertEquals(rua,endereco.getRua());
   assertEquals(bairro,endereco.getBairro());
   assertEquals(numero,endereco.getNumero());
   assertEquals(cep,endereco.getCep());
   assertEquals(cidade,endereco.getCidade());
   assertEquals(estado,endereco.getEstado());
}


}