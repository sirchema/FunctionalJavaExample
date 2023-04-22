package biconsumer;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.stream.Collectors;

public class MapTest {
    public static void main(String[] args) {
        String[][] array ={{"Chema", "Spain"}, {"Sara", "France"}, {"Vega", "UK"}, {"Pablo", "Brazil"}};

        Map<String, String> map = Arrays.stream(array).collect(Collectors.toMap(pair -> pair[0], pair -> pair[1]));

        System.out.println("Old way to print map");
        Iterator<Map.Entry<String, String>> iter = map.entrySet().iterator();
        if(iter != null){
            while (iter.hasNext()){
                Map.Entry<String, String> entry = iter.next();
                System.out.println("Clave: " + entry.getKey() + "\t" + " Valor: " + entry.getValue());
            }
        }

        System.out.println("\n");
        System.out.println("New way to print map");
        map.forEach( (key, value) -> {
            System.out.println("Clave: " + key + "\t" + " Valor: " + value);
        });
    }
}
