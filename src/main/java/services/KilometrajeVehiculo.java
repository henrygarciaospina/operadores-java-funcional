    /*
    Operación intermedia
    map:Realizar proyección del atributo kilometros.
    */

    package services;

    import model.Vehiculo;
    import model.VehiculoRepository;

    import java.util.List;
    import java.util.stream.Collectors;

    public class KilometrajeVehiculo {
        public List<Integer> obtenerKilometrajeVehiculo() {

            VehiculoRepository vehiculoRepository = new VehiculoRepository();
            List<Vehiculo> vehiculoList;
            vehiculoList = vehiculoRepository.getVehiculos();

            // Proyección del atributo kilometros
            return  vehiculoList.stream()
                    .map(Vehiculo::getKilometros)
                    .collect(Collectors.toList());

    /* Output
       [10000, 20000, 30000, 100000, 200000, 300000, 0]
    */
        }
    }