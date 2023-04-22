package function;

import java.util.function.Function;

public class DatosComensal {

    public static void main(String[] args) {
        Comensal com1 = new Comensal("José María", 50d, 1);

        String nombreCom = (String) getDatoComensal(com1, x -> x.getNombre());
        int mesa = (int) getDatoComensal(com1, Comensal::getMesa);

        System.out.println("El nombre del comensal es: " + nombreCom);
        System.out.println("El número de mesa es: " + mesa);
    }
    public static Object getDatoComensal(Comensal comensal, Function<Comensal, Object> func){
     return func.apply(comensal);
    }
}
