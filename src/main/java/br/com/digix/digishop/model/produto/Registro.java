package br.com.digix.digishop.model.produto;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Registro {
    private byte [] arrayBytes;

    public Registro(byte[] arrayBytes) {
        this.arrayBytes = arrayBytes;
    }
    
}
