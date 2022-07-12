    /*
       Regresar sólo las parejas que son divisibles entre 3 (flatMap,filter y map)
    */

    package services;

    import java.util.Arrays;
    import java.util.List;
    import java.util.stream.Collectors;

    public class ParejaDivisible {
        public  List<String>  FiltrarParejaDivisible() {

            List<Integer>  primeraListaDeNumeros = Arrays.asList(1,2,3);
            List<Integer>  segundaListaDeNumeros = Arrays.asList(3,4);

            return primeraListaDeNumeros.stream()
                    .flatMap(i -> segundaListaDeNumeros.stream()
                            .filter(j ->(i+j)%3==0)
                    .map(j-> new int[]{i,j})).map(Arrays::toString)
                    .collect(Collectors.toList());
    /* Output
        [[2, 4], [3, 3]]
    */
        }
    }