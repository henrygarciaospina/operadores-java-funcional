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
import java.util.TreeSet;
import java.util.stream.Collectors;

public class Ejemplo_2_3 {

    public Ejemplo_2_3() {
        List<Vehiculo> vehiculoList = new ArrayList<>();

    }
    public static TreeSet<String> execute() {  //TreeSet


        VehiculoRepository vehiculoRepository = new VehiculoRepository();
        List<Vehiculo> vehiculoList;

        // Alteración de kilómetros
        vehiculoList = vehiculoRepository.getVehiculos();


        return vehiculoList.stream()
                .map(v -> v.getKilometros() * 2)
                .map(p-> p.toString())
                .flatMap(c-> Arrays.stream(c.split("")))
                .collect(Collectors.toCollection(TreeSet::new));

    /* Output
    TreeSet
    - Almacena elementos únicos.
    - No conserva el orden de inserción de los elementos.
    - Ordena los elementos en orden ascendente
    - No es seguro para subprocesos

   [0, 2, 4, 6]
    */
    }
    public static void main(String[] args) {
        System.out.println(Ejemplo_2_3.execute());
    }
}
