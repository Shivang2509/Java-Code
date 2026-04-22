//Make a Calculator. Take 2 numbers (a & b) from the user and an operation as follows : 
//1 : + (Addition) a + b
//2 : - (Subtraction) a - b
//3 : * (Multiplication) a * b
//4 : / (Division) a / b
//5 : % (Modulo or remainder) a % b 

import java.util.*;
public class Problem1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int Addition = a + b;
        int Subtraction = a - b;
        int Multiplication = a * b;
        int Division = a / b;
        int Modulo = a % b;
        System.out.println(Addition);
        System.out.println(Subtraction);
        System.out.println(Multiplication);
        System.out.println(Division);
        System.out.println(Modulo);
    }
}
    

