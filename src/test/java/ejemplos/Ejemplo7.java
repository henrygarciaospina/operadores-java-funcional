    /*
    Operación intermedia
    peek:
          Esta operación no realiza cambios sobre el stream y lo devuelve tal y como entra. El propósito
          principal consiste en hacer debugging al ejecutar cualquier otra operación, ya que permite
          imprimir valores de los elementos del stream.
    */

    package ejemplos;

    import model.Vehiculo;
    import model.VehiculoRepository;

    import java.util.ArrayList;
    import java.util.List;
    import java.util.stream.Collectors;

    public class Ejemplo7 {

        private VehiculoRepository vehiculoRepository;

        public Ejemplo7() {
            List<Vehiculo> vehiculoList = new ArrayList<>();
        }
        public static List<String> execute() {

            VehiculoRepository vehiculoRepository = new VehiculoRepository();
            List<Vehiculo> vehiculoList;
            vehiculoList = vehiculoRepository.getVehiculos();

            List<String> result = vehiculoList.stream()
                    .filter(v -> v.getKilometros() > 20000)
                    .peek(v -> System.out.println(v.getKilometros()))
                    .map(Vehiculo::getMatricula)
                    .peek(v -> System.out.println(v))
                    .collect(Collectors.toList());

            return result;

    /*Output Muestra la información filtrada y su resultado
       [ 3333CCC, OPEL, 30000 ]
        3333CCC
        [ 4444DDD, BMW, 100000 ]
        4444DDD
        [ 5555EEE, AUDI, 200000 ]
        5555EEE
        [ 6666FFF, OPEL, 300000 ]
        6666FFF
        [3333CCC, 4444DDD, 5555EEE, 6666FFF]
    */
        }

        public static void main(String[] args) {
            System.out.println(Ejemplo7.execute());
        }
    }