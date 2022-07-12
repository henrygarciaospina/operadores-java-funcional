package services;

import model.enums.MarcaVehiculo;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FiltraMarcaTest {
    @Test
    void filtrarMarca() {
        //Configuración (definición de variables)
        FiltraMarca filtraMarca = new FiltraMarca();

        //Esperado
        List<MarcaVehiculo> resultadoFiltrarMarca = Arrays.asList(
                (MarcaVehiculo.BMW),
                (MarcaVehiculo.AUDI),
                (MarcaVehiculo.HONDA),
                (MarcaVehiculo.OPEL),
                (MarcaVehiculo.CITROEN));

        //Actuar (datos de retorno)
        List<MarcaVehiculo> filtradosMarca = filtraMarca.filtrarMarca();
        // resultadoFiltrarMarcaVehiculo.toArray(),filtradosMarcaVehiculo.toArray()
        //Verificación (lo que retorna es igual a los que se espera
        assertArrayEquals(resultadoFiltrarMarca.toArray(), filtradosMarca.toArray());
        assertEquals(resultadoFiltrarMarca, filtradosMarca);
    }
}