package services;

import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class DuplicaKilometrajeTest {
    @Test
    void duplicarKilometraje(){
        //Configuración (definición de variables)
        DuplicaKilometraje duplicarKilometraje = new DuplicaKilometraje();
        //Esperado
        List<Integer> resultadoDuplicarKilometraje = Arrays.asList(20000, 40000, 60000, 200000, 400000, 600000, 0);

        //Actuar (datos de retorno)
        List<Integer> kilometrajeDuplicado = duplicarKilometraje.duplicarKilometraje();

        //Verificación (lo que retorna es igual a los que se espera
        assertArrayEquals(resultadoDuplicarKilometraje.toArray(),kilometrajeDuplicado.toArray());
        assertEquals(resultadoDuplicarKilometraje,kilometrajeDuplicado);
    }
}