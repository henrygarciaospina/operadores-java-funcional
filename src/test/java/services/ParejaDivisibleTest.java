package services;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ParejaDivisibleTest {
    @Test
    void filtrarParejaDivisible(){
        //Configuración (definición de variables)
        ParejaDivisible parejaDivisible = new ParejaDivisible();

        //Actuar (datos de retorno)
        List<String> parejasDivisibles = parejaDivisible.FiltrarParejaDivisible();

        //Esperado
        List<String> resultadoParejasDivisibles = Arrays.asList("[2, 4]","[3, 3]");

       assertEquals(resultadoParejasDivisibles, parejasDivisibles);
       assertEquals(resultadoParejasDivisibles.size(), parejasDivisibles.size());

    }

}