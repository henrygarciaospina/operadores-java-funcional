package services;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CaracterUnico {

    public List<String> obtenerCaracteresUnicos() {

        List<String> palabras = new ArrayList<>();
        palabras.add("Hola");
        palabras.add("Mundo");
        return palabras.stream()
                .map(w-> w.split(""))
                .flatMap(Arrays::stream)
                .distinct()
                .collect(Collectors.toList());
    }
}