package services;
import static org.junit.jupiter.api.Assertions.*;
import model.Vehiculo;
import model.enums.MarcaVehiculo;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

class FiltraMarcaVehiculoTest {
    @Test
    void filtrarMarcaVehiculo(){
        //Configuración (definición de variables)
        FiltraMarcaVehiculo filtraMarcaVehiculo = new FiltraMarcaVehiculo();

        //Esperado
        List<Vehiculo> resultadoFiltrarMarcaVehiculo =  Arrays.asList(
                (new Vehiculo("2222BBB", MarcaVehiculo.AUDI, 20000)),
                 new Vehiculo("5555EEE", MarcaVehiculo.AUDI, 200000));

        //Actuar (datos de retorno)
        List<Vehiculo> filtradosMarcaVehiculo = filtraMarcaVehiculo.filtrarMarcaVehiculo();
        //Verificación (lo que retorna es igual a los que se espera
        assertArrayEquals(resultadoFiltrarMarcaVehiculo.toArray(), filtradosMarcaVehiculo.toArray());
        assertEquals(resultadoFiltrarMarcaVehiculo,filtradosMarcaVehiculo);
    }
}