
import java.util.Scanner;

class Main {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Hello Koder");

        int n;
        String[] arr = new String[5];   

        System.out.println("Enter the value of n");
        n = s.nextInt();
        s.nextLine(); 

        System.out.println("Enter elements in string array");
        for (int i = 0; i < 5; i++) {
            arr[i] = s.nextLine();
        }

        System.out.println("The value of n is: " + n);

        System.out.println("String array elements are:");
        for (int i = 0; i < 5; i++) {
            System.out.println(arr[i]);
        }

        if (args.length > 0) {
            System.out.println("The first value from args is: " + args[0]);
        } else {
            System.out.println("No command-line argument given");
        }

        s.close();
    }
}
