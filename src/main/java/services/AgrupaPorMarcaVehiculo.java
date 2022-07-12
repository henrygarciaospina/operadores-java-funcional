    /*
    Operación terminal
         collect y groupingBy : Ejecuta lo que denominan mutable reduction, que consiste en acumular los resultados
         en una Collection a medida que los va procesando en la pipeline del stream y los agrupa por un criterio
    */

    package services;

    import model.Vehiculo;
    import model.VehiculoRepository;
    import model.enums.MarcaVehiculo;

    import java.util.List;
    import java.util.Map;
    import java.util.stream.Collectors;

    public class AgrupaPorMarcaVehiculo {
        public Map<MarcaVehiculo, List<Vehiculo>> agruparPorMarcaVehiculo() {

            VehiculoRepository vehiculoRepository = new VehiculoRepository();
            List<Vehiculo> vehiculoList;

            vehiculoList = vehiculoRepository.getVehiculos();
            return vehiculoList.parallelStream()
                    .collect(Collectors.groupingBy(Vehiculo::getMarcaVehiculo));
    /* Output
{
   BMW=[[ 1111AAA, BMW, 10000 ], [ 4444DDD, BMW, 100000 ]],
   CITROEN=[[ 7777GGG, CITROEN, 0 ]],
   AUDI=[[ 2222BBB, AUDI, 20000 ], [ 5555EEE, AUDI, 200000 ]],
   OPEL=[[ 3333CCC, OPEL, 30000 ],[ 6666FFF, OPEL, 300000 ]]
}
    */
        }
   }