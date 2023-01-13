package br.com.digix.digishop.model.produto;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;

import org.junit.jupiter.api.Test;

public class RegistroTest {
    
    @Test
    void deve_registrar_uma_foto() throws IOException{
        BufferedImage imagemEsperada;
        imagemEsperada = ImageIO.read(new File("C:/Users/lennonsilva/Downloads/foto.jpg"));
        ByteArrayOutputStream bytesImagem = new ByteArrayOutputStream();
        ImageIO.write(imagemEsperada, "jpeg", bytesImagem);
        bytesImagem.flush();
        byte [] arrayBytesEsperado = bytesImagem.toByteArray();
        bytesImagem.close();

        Registro registro = new Registro(arrayBytesEsperado);

        assertArrayEquals(arrayBytesEsperado, registro.getArrayBytes());
    }

}
