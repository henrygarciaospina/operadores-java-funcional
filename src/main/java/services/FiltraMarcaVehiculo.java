    /*
    Operación intermedia
    filter:
         Filtra los elementos a partir del la condición de la función pasada como parámetro.
    */


    package services;
    import model.Vehiculo;
    import model.VehiculoRepository;
    import model.enums.MarcaVehiculo;

    import java.util.List;
    import java.util.stream.Collectors;

    public class FiltraMarcaVehiculo {
        public List<Vehiculo> filtrarMarcaVehiculo() {

            VehiculoRepository vehiculoRepository = new VehiculoRepository();
            List<Vehiculo> vehiculoList;

            vehiculoList = vehiculoRepository.getVehiculos();
            return vehiculoList.stream()
                    .filter(v -> v.getMarcaVehiculo().equals(MarcaVehiculo.AUDI))
                    .collect(Collectors.toList());
/*
    Output Filtra los vehículos Marca = Audi
   [[ 2222BBB, AUDI, 20000 ], [ 5555EEE, AUDI, 200000 ]]

 */
        }
    }
