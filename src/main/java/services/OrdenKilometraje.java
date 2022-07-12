    /*
    Operación intermedia
         distinct: Retorna un stream con elementos no repetidos basándose
         en la comparación entre objetos con la función equals (Object.equals(object)).
    */

    package services;
    import model.Vehiculo;
    import model.VehiculoRepository;

    import java.util.Comparator;
    import java.util.List;
    import java.util.stream.Collectors;

    public class OrdenKilometraje {
        public List<Vehiculo> ordenarKilometraje() {

            VehiculoRepository vehiculoRepository = new VehiculoRepository();
            List<Vehiculo> vehiculoList;

            vehiculoList = vehiculoRepository.getVehiculos();
            return vehiculoList.stream()
                    .sorted(Comparator.comparingInt(Vehiculo::getKilometros))
                    .collect(Collectors.toList());

    /*Output (ordena en forma ascenente los vehículos por kilometraje)
      [ 7777GGG, CITROEN, 0 ], [ 1111AAA, BMW, 10000 ], [ 2222BBB, AUDI, 20000 ],
      [ 3333CCC, HONDA, 30000 ], [ 4444DDD, BMW, 100000 ],
      [ 5555EEE, AUDI, 200000 ], [ 6666FFF, OPEL, 300000 ]]

    */
        }

    }