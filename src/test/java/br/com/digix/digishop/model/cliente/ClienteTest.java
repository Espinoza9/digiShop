package br.com.digix.digishop.model.cliente;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import lombok.Data;

public class ClienteTest {
    
    @Test
    void deve_criar_um_cliente(){
        //Arranje
        String cpf = "01556238877";
        String nome = "Lennon Martins";
        String rua = "Rua dos cajás";
        String email = "lennonmcarlos@outlook.com";
        String telefone = "67981344532";
        
        //Act
        Cliente cliente = new Cliente(cpf, nome, rua, email, telefone);

        //Assertion
        assertEquals(cpf, cliente.getCpf());
        assertEquals(nome, cliente.getNome());
        assertEquals(rua, cliente.getRua());
        assertEquals(email, cliente.getEmail());
        assertEquals(telefone, cliente.getTelefone());
    }
}
