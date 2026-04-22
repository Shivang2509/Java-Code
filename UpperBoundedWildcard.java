import java.util.*;

public class UpperBoundedWildcard {
    public static double sumList(List<? extends Number> list) {
        return list.stream()
                   .mapToDouble(Number::doubleValue)
                   .sum();
    }

    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(10, 20, 30);
        List<Double> doubleList = Arrays.asList(5.5, 2.5, 1.0);

        System.out.println("Sum of Integer List:" + sumList(intList));
        System.out.println("Sum of Double List:" + sumList(doubleList));
    }
}
