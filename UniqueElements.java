import java.util.*;

public class UniqueElements {
    public static void main(String[] args) {
        ArrayList <Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(10);
        list.add(40);
        list.add(50);
        list.add(60);
        list.add(40);
        list.add(20);
        list.add(70);

        System.out.println("ArrayList:" + list);

        Set <Integer> uniqueSet = new HashSet<>(list);
        System.out.println("uniueSet:" + uniqueSet); 
    }
}
