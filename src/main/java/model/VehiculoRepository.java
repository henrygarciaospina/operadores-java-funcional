package model;

import model.enums.MarcaVehiculo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class VehiculoRepository {
    private List<Vehiculo> vehiculos = new ArrayList<>();

    public VehiculoRepository() {
        generarData();
    }

    private void generarData() {
        vehiculos = Arrays.asList(
        new Vehiculo("1111AAA", MarcaVehiculo.BMW, 10000),
        new Vehiculo("2222BBB", MarcaVehiculo.AUDI, 20000),
        new Vehiculo("3333CCC", MarcaVehiculo.HONDA, 30000),
        new Vehiculo("4444DDD", MarcaVehiculo.BMW, 100000),
        new Vehiculo("5555EEE", MarcaVehiculo.AUDI, 200000),
        new Vehiculo("6666FFF", MarcaVehiculo.OPEL, 300000),
        new Vehiculo("7777GGG", MarcaVehiculo.CITROEN, 0)
        );
    }

    public List<Vehiculo> getVehiculos(){
        return this.vehiculos;
    }
}