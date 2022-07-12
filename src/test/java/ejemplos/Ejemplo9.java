    /*
    Operación intermedia
    forEach:
          Realiza la acción de la función por parámetro para cada elemento.

    */

    package ejemplos;

    import model.Vehiculo;
    import model.VehiculoRepository;

    import java.util.ArrayList;
    import java.util.List;
    import java.util.stream.Collectors;

    public class Ejemplo9 {

        private VehiculoRepository vehiculoRepository;

        public Ejemplo9() {
            List<Vehiculo> vehiculoList = new ArrayList<>();
        }
        public static String execute() {

            VehiculoRepository vehiculoRepository = new VehiculoRepository();
            List<Vehiculo> vehiculoList;
            vehiculoList = vehiculoRepository.getVehiculos();

            vehiculoList.parallelStream()
                    .limit(6)
                    .forEach(System.out::println);

    /*Output imprime en pantalla los elementos
      [ 3333CCC, OPEL, 30000 ]
      [ 4444DDD, BMW, 100000 ]
      [ 2222BBB, AUDI, 20000 ]
      [ 1111AAA, BMW, 10000 ]
    */
            return "";
        }

        public static void main(String[] args) {
            System.out.println(Ejemplo9.execute());
        }
    }