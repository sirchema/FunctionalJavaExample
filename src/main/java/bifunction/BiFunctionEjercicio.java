package bifunction;

public class BiFunctionEjercicio {
    public static void main(String[] args) {
        java.util.function.BiFunction<String,String, String> bi = (x , y) -> x + y;

        System.out.println(bi.apply("Hola ", "Mundo!"));
    }
}
