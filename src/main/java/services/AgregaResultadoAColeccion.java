    /*
    Operación terminal
         collect: Ejecuta lo que denominan mutable reduction, que consiste en acumular los resultados
         en una Collection a medida que los va procesando en la pipeline del stream
    */

    package services;

    import model.Vehiculo;
    import model.VehiculoRepository;

    import java.util.List;
    import java.util.stream.Collectors;

    public class AgregaResultadoAColeccion {

        public List<Vehiculo> agregarResultadoAColeccion() {

            VehiculoRepository vehiculoRepository = new VehiculoRepository();
            List<Vehiculo> vehiculoList;

            vehiculoList = vehiculoRepository.getVehiculos();
            return vehiculoList.stream()
                    .limit(4)
                    .collect(Collectors.toList());
    /* Output
[[[ 1111AAA, BMW, 10000 ], [ 2222BBB, AUDI, 20000 ], [ 3333CCC, HONDA, 30000 ], [ 4444DDD, BMW, 100000 ]]
    */
        }
    }