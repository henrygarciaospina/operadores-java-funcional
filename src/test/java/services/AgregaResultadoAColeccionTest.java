package services;

import model.Vehiculo;
import model.enums.MarcaVehiculo;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AgregaResultadoAColeccionTest {
    @Test
    void agregarResultadoAColeccion(){

        //Configuración (definición de variables)
        AgregaResultadoAColeccion agregaResultadoAColeccion= new AgregaResultadoAColeccion();
        //Esperado
        List<Vehiculo> resultadoAgregadoAColeccion = Arrays.asList(
                new Vehiculo("1111AAA", MarcaVehiculo.BMW, 10000),
                (new Vehiculo("2222BBB", MarcaVehiculo.AUDI,20000)),
                (new Vehiculo( "3333CCC", MarcaVehiculo.HONDA, 30000)),
                (new Vehiculo("4444DDD", MarcaVehiculo.BMW, 100000)));

        //Actuar (datos de retorno)
        List<Vehiculo> ResultadoAColeccion = agregaResultadoAColeccion.agregarResultadoAColeccion();

        //Verificación (lo que retorna es igual a los que se espera
        assertArrayEquals(resultadoAgregadoAColeccion.toArray(),ResultadoAColeccion.toArray());
        assertEquals(resultadoAgregadoAColeccion,ResultadoAColeccion );

    }

}