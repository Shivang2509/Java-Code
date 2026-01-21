import java.util.Scanner;

public class sum_array {
    public static void main(String[] args) {

        int sum, sum_array = 0;
        Scanner s = new Scanner(System.in);

        System.out.print("Enter the sum: ");

        sum = s.nextInt();

        int arr[] = new int[5];

        System.out.println("Enter 5 array");

        for (int i = 0; i < 5; i++) {
            arr[i] = s.nextInt();
            sum_array += arr[i];
        }

       if (sum == sum_array) {
    System.out.println("Equal");
} else {
    System.out.println("Not Equal");
}

s.close();

    }
}
