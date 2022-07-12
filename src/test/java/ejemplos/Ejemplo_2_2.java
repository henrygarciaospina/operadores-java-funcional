/*
Operación intermedia
map: Altera los elementos en base a una función y los devuelve alterados.
     También permite realizar proyecciones de atributos.
*/

package ejemplos;

import model.Vehiculo;
import model.VehiculoRepository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Ejemplo_2_2 {

    public Ejemplo_2_2() {
        List<Vehiculo> vehiculoList = new ArrayList<>();

    }

    public static List<String> execute() {  //Lista de String


        VehiculoRepository vehiculoRepository = new VehiculoRepository();
        List<Vehiculo> vehiculoList;

        // Alteración de kilómetros
        vehiculoList = vehiculoRepository.getVehiculos();

        return vehiculoList.stream()
                .map(v -> v.getKilometros() * 2)
                .map(vs -> vs.toString())
                .map(vsp -> vsp.split(""))
                .map(Arrays::toString)
                .collect(Collectors.toList());

    /* Output
   [[2, 0, 0, 0, 0], [4, 0, 0, 0, 0], [6, 0, 0, 0, 0], [2, 0, 0, 0, 0, 0], [4, 0, 0, 0, 0, 0], [6, 0, 0, 0, 0, 0], [0]]
    */
    }

    public static void main(String[] args) {
        System.out.println(Ejemplo_2_2.execute());

    }
}