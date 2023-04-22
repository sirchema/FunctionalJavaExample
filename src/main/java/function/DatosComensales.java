package function;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class DatosComensales {

    public static void main(String[] args) {
        List<Comensal> listaComensales = Arrays.asList(new Comensal("José María", 20, 1),
                new Comensal("Sara", 30,2),
                new Comensal("Vega", 40, 3),
                new Comensal("Pablo", 50, 4),
                new Comensal("Gaspar", 60, 5));

        List<Object> nombresComensales = getDatosComensales(listaComensales, Comensal::getNombre);

        System.out.println("La lista de nombre de los comensales es: ");
        nombresComensales.forEach(System.out::println);

        List<Object> cuentasComensales = getDatosComensales(listaComensales,
                getCuentasPorMesa());

        System.out.println("La cuenta de las mesas son: ");
        cuentasComensales.forEach(System.out::println);
    }

    private static Function<Comensal, Object> getCuentasPorMesa() {
        return x -> "Mesa " + x.getMesa() + ": " + x.getCuenta() + "€";
    }

    private static List<Object> getDatosComensales(List<Comensal> listaCom, Function<Comensal, Object> func) {
        List<Object> listaDatos = new ArrayList<>();

        for(Comensal comensal: listaCom) {
            listaDatos.add(func.apply(comensal));
        }

        return listaDatos;
    }
}
