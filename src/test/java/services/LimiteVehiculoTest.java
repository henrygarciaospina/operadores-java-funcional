package services;

import static org.junit.jupiter.api.Assertions.*;
import model.Vehiculo;
import model.enums.MarcaVehiculo;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

class LimiteVehiculoTest {
    @Test
    void limitarVehiculos() {

        //Configuración (definición de variables)
        LimiteVehiculo limiteVehiculo = new LimiteVehiculo();

        //Esperado
        List<Vehiculo> resultadoLimiteVehiculos = Arrays.asList(
                (new Vehiculo("1111AAA", MarcaVehiculo.BMW, 10000)),
                (new Vehiculo("2222BBB", MarcaVehiculo.AUDI, 20000)),
                (new Vehiculo("3333CCC", MarcaVehiculo.HONDA, 30000)),
                (new Vehiculo("4444DDD", MarcaVehiculo.BMW, 100000)));

        //Actuar (datos de retorno)
        List<Vehiculo> limiteVehiculos = limiteVehiculo.limitarElementos();

        //Verificación (lo que retorna es igual a los que se espera
        assertArrayEquals(resultadoLimiteVehiculos.toArray(), limiteVehiculos.toArray());
        assertEquals(resultadoLimiteVehiculos, limiteVehiculos);
    }
}