    /*
    Operación intermedia
    distinct:
         Retorna un stream con elementos no repetidos basándose en la comparación
         entre objetos con la función equals (Object.equals(object)).
    */

    package services;

    import model.Vehiculo;
    import model.VehiculoRepository;
    import model.enums.MarcaVehiculo;

    import java.util.List;
    import java.util.stream.Collectors;

    public class FiltraMarca {
        public List<MarcaVehiculo> filtrarMarca() {

            VehiculoRepository vehiculoRepository = new VehiculoRepository();
            List<Vehiculo> vehiculoList;
            vehiculoList = vehiculoRepository.getVehiculos();

            // Distintos según modelo
            return vehiculoList.stream()
                    .map(Vehiculo::getMarcaVehiculo)
                    .distinct()
                    .collect(Collectors.toList());

    /*Output Distintos según modelo
       [BMW, AUDI, OPEL, CITROEN]
    */
        }
    }