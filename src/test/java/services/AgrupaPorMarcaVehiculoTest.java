package services;

import model.Vehiculo;
import model.enums.MarcaVehiculo;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class AgrupaPorMarcaVehiculoTest {

    @Test
    void agruparPorMarcaVehiculo(){

/*
        BMW=[[ 1111AAA, BMW, 10000 ], [ 4444DDD, BMW, 100000 ]],
        CITROEN=[[ 7777GGG, CITROEN, 0 ]],
        AUDI=[[ 2222BBB, AUDI, 20000 ], [ 5555EEE, AUDI, 200000 ]],
        OPEL=[[ 3333CCC, OPEL, 30000 ],[ 6666FFF, OPEL, 300000 ]]

 */
        //Configuración (definición de variables)
        AgrupaPorMarcaVehiculo agrupaPorMarcaVehiculo = new AgrupaPorMarcaVehiculo();
        //Esperado
        Map<MarcaVehiculo, List<Vehiculo>> resultadoAgruparPorMarcaVehiculo = new HashMap<>();
        resultadoAgruparPorMarcaVehiculo.put(MarcaVehiculo.BMW, Arrays.asList(new Vehiculo( "1111AAA", MarcaVehiculo.BMW, 10000 ),new Vehiculo("4444DDD", MarcaVehiculo.BMW, 100000)));
        resultadoAgruparPorMarcaVehiculo.put(MarcaVehiculo.AUDI, Arrays.asList(new Vehiculo( "2222BBB", MarcaVehiculo.AUDI, 20000), new Vehiculo("5555EEE", MarcaVehiculo.AUDI, 200000)));
        resultadoAgruparPorMarcaVehiculo.put(MarcaVehiculo.HONDA, Arrays.asList(new Vehiculo( "3333CCC", MarcaVehiculo.HONDA, 30000 )));
        resultadoAgruparPorMarcaVehiculo.put(MarcaVehiculo.CITROEN, Arrays.asList(new Vehiculo( "7777GGG", MarcaVehiculo.CITROEN, 0 )));
        resultadoAgruparPorMarcaVehiculo.put(MarcaVehiculo.OPEL, Arrays.asList(new Vehiculo( "3333CCC", MarcaVehiculo.HONDA, 30000), new Vehiculo("6666FFF", MarcaVehiculo.OPEL, 300000)));
        //Actuar (datos de retorno)
        Map<MarcaVehiculo, List<Vehiculo>>  vehiculosAgrupadosPorMarca = agrupaPorMarcaVehiculo.agruparPorMarcaVehiculo();

        assertEquals(resultadoAgruparPorMarcaVehiculo.size(), vehiculosAgrupadosPorMarca.size());
    }

}