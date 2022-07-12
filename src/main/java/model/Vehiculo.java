package model;

import lombok.*;
import model.enums.MarcaVehiculo;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
public class Vehiculo {

    private String matricula;
    private MarcaVehiculo marcaVehiculo;
    private int kilometros;

}