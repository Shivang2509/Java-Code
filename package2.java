package package2;
import package1.Car;

public class Package2 {

    public static void main(String[] args) {

        Car c = new Car();

        c.milage = 100;
        c.price = 200000;

        int sum = c.milage + c.price;

        System.out.println("Sum = " + sum);
    }
}
