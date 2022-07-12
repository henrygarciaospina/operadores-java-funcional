package services;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;

class KilometrajeVehiculoTest {
    @Test
    void obtenerKilometrajeVehiculos(){
        //Configuración (definición de variables)
        KilometrajeVehiculo  kilometrajeVehiculo = new KilometrajeVehiculo ();

        //Esperado
        List<Integer> resultadoKilometrajeVehiculos = Arrays.asList(10000, 20000, 30000, 100000, 200000, 300000, 0);

        //Actuar (datos de retorno)
        List<Integer> kilometrajes = kilometrajeVehiculo.obtenerKilometrajeVehiculo() ;

        //Verificación (lo que retorna es igual a los que se espera
        assertArrayEquals(resultadoKilometrajeVehiculos.toArray(),kilometrajes.toArray());
        assertEquals(resultadoKilometrajeVehiculos,kilometrajes);
    }
}