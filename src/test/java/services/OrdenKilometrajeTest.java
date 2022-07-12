package services;

import model.Vehiculo;
import model.enums.MarcaVehiculo;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class OrdenKilometrajeTest {
    @Test
    void ordenarkilometraje(){
        //Configuración (definición de variables)
        OrdenKilometraje ordenaKilometraje = new OrdenKilometraje();

        //Esperado
        List<Vehiculo> resultadoOrdenaKilometraje = Arrays.asList(
                (new Vehiculo("7777GGG", MarcaVehiculo.CITROEN, 0)),
                (new Vehiculo("1111AAA", MarcaVehiculo.BMW, 10000)),
                (new Vehiculo("2222BBB", MarcaVehiculo.AUDI, 20000)),
                (new Vehiculo("3333CCC", MarcaVehiculo.HONDA, 30000)),
                (new Vehiculo("4444DDD", MarcaVehiculo.BMW, 100000)),
                (new Vehiculo("5555EEE", MarcaVehiculo.AUDI, 200000)),
                (new Vehiculo("6666FFF", MarcaVehiculo.OPEL, 300000)));

        //Actuar (datos de retorno)
        List<Vehiculo> kilometrajeOrdenado = ordenaKilometraje.ordenarKilometraje();

        //Verificación (lo que retorna es igual a los que se espera
        assertArrayEquals(resultadoOrdenaKilometraje.toArray(),kilometrajeOrdenado.toArray());
        assertEquals(resultadoOrdenaKilometraje,kilometrajeOrdenado);
    }
}