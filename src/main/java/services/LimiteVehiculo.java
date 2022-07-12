    /*
    Operación intermedia
    limit:
          Limita el número de vehículos que tiene como salida el nuevo stream.
    */

    package services;

    import model.Vehiculo;
    import model.VehiculoRepository;

    import java.util.List;
    import java.util.stream.Collectors;

    public class LimiteVehiculo {
        public  List<Vehiculo> limitarElementos() {

            VehiculoRepository vehiculoRepository = new VehiculoRepository();
            List<Vehiculo> vehiculoList;
            vehiculoList = vehiculoRepository.getVehiculos();

            return vehiculoList.stream()
                    .limit(4)
                    .collect(Collectors.toList());

    /*Output retorna una lista con la cantidad de vehiculos dados a limit
       [[ 1111AAA, BMW, 10000 ], [ 2222BBB, AUDI, 20000 ], [ 3333CCC, OPEL, 30000 ], [ 4444DDD, BMW, 100000 ]]
    */
        }
    }