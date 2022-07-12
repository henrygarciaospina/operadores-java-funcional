    /*
    Operación terminal
         reduce :  Permite hacer una reducción de los resultados del stream,
         lo cual consiste en acumular el resultado en un resultado resumido de la entrada,
          por ejemplo, encontrar la suma de un stream de enteros.
          También hay otras operaciones que utilizan la operación
          reduce en background y son terminales, como sum().
    */

    package services;

    import model.Vehiculo;
    import model.VehiculoRepository;

    import java.util.List;


    public class SumaKilometrajeVehiculo {

        public Integer sumarKilometrajeVehiculos() {

            VehiculoRepository vehiculoRepository = new VehiculoRepository();
            List<Vehiculo> vehiculoList;

            vehiculoList = vehiculoRepository.getVehiculos();
            // Suma de todos los kilómetros de todos los vehiculos
            return vehiculoList.stream()
                    .map(Vehiculo::getKilometros)
                    .reduce(0, Integer::sum);
    /* Output
        660000
    */
        }
    }