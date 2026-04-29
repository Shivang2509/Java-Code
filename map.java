package collections;
import java.util.Map;
import java.util.HashMap;

public class map {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();

        map.put(1, "Apple");
        map.put(2, "Litchi");
        map.put(3, "Mango");
        
        System.out.println("Map:" + map);

        map.remove(2);

        map.put(3, "orange");

        System.out.println("Updated Map:" + map);      
    }
}