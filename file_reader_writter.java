import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class file_reader_writter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            FileInputStream fis = new FileInputStream("sample.txt");
            int i;
            System.out.print("File content: ");
            while ((i = fis.read()) != -1) {
                System.out.print((char) i);
            }
            fis.close();

            System.out.print("\nEnter text: ");
            String data = sc.nextLine();

            FileOutputStream fos = new FileOutputStream("sample.txt"); 
            fos.write(data.getBytes());
            fos.close();

            System.out.println("updated text: " + data);
            System.out.println("Data written successfully.");

        } catch (IOException e) {
            System.out.println(e);
        }

        sc.close();
    }
}
