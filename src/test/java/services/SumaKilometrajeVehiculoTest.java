package services;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
class SumaKilometrajeVehiculoTest {

    @Test
    void sumarKilometrajeVehiculos() {
        //Configuración (definición de variables)
        SumaKilometrajeVehiculo  sumaKilometrajeVehiculo = new SumaKilometrajeVehiculo ();

        //Esperado
        Integer resultadoSumaKilometrajes =   660000;

        //Actuar (datos de retorno)
        Integer sumaKilometrajeVehiculos  =sumaKilometrajeVehiculo.sumarKilometrajeVehiculos();

        assertEquals(resultadoSumaKilometrajes, sumaKilometrajeVehiculos);
    }
}