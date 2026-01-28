import java.util.Scanner;

public class duplicate_check_array {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("How many elements are there in array: ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        boolean duplicateFound = false;

        // Checking duplicate elements
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    duplicateFound = true;
                    break;
                }
            }
        }

        // Output
        if (duplicateFound) {
            System.out.println("Duplicate element found in the array.");
        } else {
            System.out.println("No duplicate element found in the array.");
        }

        sc.close();
    }
}
