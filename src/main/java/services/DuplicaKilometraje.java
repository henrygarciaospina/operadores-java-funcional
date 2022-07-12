    /*
    Operación intermedia
    map: En este ejemplo duplica la cantidad de kilometraje.

    */
    package services;

    import model.Vehiculo;
    import model.VehiculoRepository;

    import java.util.List;
    import java.util.stream.Collectors;

    public class DuplicaKilometraje {
        public List<Integer> duplicarKilometraje() {

            VehiculoRepository vehiculoRepository = new VehiculoRepository();
            List<Vehiculo> vehiculoList;

            // Alteración de kilómetros
            vehiculoList = vehiculoRepository.getVehiculos();
            return vehiculoList.stream()
                    .map(v -> v.getKilometros() * 2)
                    .collect(Collectors.toList());
    /*
         Original
         [10000, 20000, 30000, 100000, 200000, 300000, 0]

         Despúes del map en la nueva lista
        [20000, 40000, 60000, 200000, 400000, 600000, 0]
    */
        }
    }