package services;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

class CaracterUnicoTest {
    @Test
    void obtenerCaracteresUnicos(){
        //Configuración (definición de variables)
        CaracterUnico  caracterUnico = new CaracterUnico();
        //Esperado
        List<String> resultadoCaracteresUnicos = Arrays.asList("H","o","l","a","M","u","n","d");

        //Actuar (datos de retorno)
        List<String> palabras = caracterUnico.obtenerCaracteresUnicos();

        //Verificación (lo que retorna es igual a los que se espera
        assertArrayEquals(resultadoCaracteresUnicos.toArray(),palabras.toArray());
        assertEquals(resultadoCaracteresUnicos,palabras);
    }
}