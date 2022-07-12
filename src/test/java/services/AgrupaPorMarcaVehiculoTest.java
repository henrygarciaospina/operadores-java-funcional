package services;

import static org.junit.jupiter.api.Assertions.*;
import model.Vehiculo;
import model.enums.MarcaVehiculo;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
class AgrupaPorMarcaVehiculoTest {

    @Test
    void agruparPorMarcaVehiculo(){

        //Configuración (definición de variables)
        AgrupaPorMarcaVehiculo agrupaPorMarcaVehiculo = new AgrupaPorMarcaVehiculo();

        //Actuar (datos de retorno)
        Map<MarcaVehiculo, List<Vehiculo>>  vehiculosAgrupadosPorMarca = agrupaPorMarcaVehiculo.agruparPorMarcaVehiculo();

        assertFalse(agrupaPorMarcaVehiculo().isEmpty());
        assertEquals(agrupaPorMarcaVehiculo().size(), vehiculosAgrupadosPorMarca.size());
    }

    Map<MarcaVehiculo, List<Vehiculo>> agrupaPorMarcaVehiculo(){
        //Esperado
        Map<MarcaVehiculo, List<Vehiculo>> resultadoAgruparPorMarcaVehiculo = new HashMap<>();
        resultadoAgruparPorMarcaVehiculo.put(MarcaVehiculo.BMW, Arrays.asList(new Vehiculo( "1111AAA", MarcaVehiculo.BMW, 10000 ),new Vehiculo("4444DDD", MarcaVehiculo.BMW, 100000)));
        resultadoAgruparPorMarcaVehiculo.put(MarcaVehiculo.AUDI, Arrays.asList(new Vehiculo( "2222BBB", MarcaVehiculo.AUDI, 20000), new Vehiculo("5555EEE", MarcaVehiculo.AUDI, 200000)));
        resultadoAgruparPorMarcaVehiculo.put(MarcaVehiculo.HONDA, Arrays.asList(new Vehiculo( "3333CCC", MarcaVehiculo.HONDA, 30000 )));
        resultadoAgruparPorMarcaVehiculo.put(MarcaVehiculo.CITROEN, Arrays.asList(new Vehiculo( "7777GGG", MarcaVehiculo.CITROEN, 0 )));
        resultadoAgruparPorMarcaVehiculo.put(MarcaVehiculo.OPEL, Arrays.asList(new Vehiculo( "3333CCC", MarcaVehiculo.HONDA, 30000), new Vehiculo("6666FFF", MarcaVehiculo.OPEL, 300000)));

        return resultadoAgruparPorMarcaVehiculo;
    }
}