import java.util.Scanner;

class Employee {
    String name;
    int age;
    float salary;

    void setData(String n, int a, float s) {
        name = n;
        age = a;
        salary = s;
    }

    void showData() {
        System.out.println("Name   : " + name);
        System.out.println("Age    : " + age);
        System.out.println("Salary : " + salary);
    }
}

public class try_catch_finally {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Employee e = new Employee();

        try {
            System.out.print("Enter name (max 20 chars): ");
            String name = sc.nextLine();

            if (name.length() > 20) {
                throw new Exception("Name too long");
            }

            System.out.print("Enter age (>5): ");
            int age = sc.nextInt();

            if (age <= 5) {
                throw new Exception("Age must be greater than 5");
            }

            System.out.print("Enter salary: ");
            float salary = sc.nextFloat();

            e.setData(name, age, salary);
            e.showData();

        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        } finally {
            System.out.println("Data inserted successfully");
            sc.close();
        }
    }
}
