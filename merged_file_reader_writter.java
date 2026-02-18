import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class merged_file_reader_writter {
    public static void main(String[] args) {
        try {
            FileInputStream fis1 = new FileInputStream("sample.txt");
            FileInputStream fis2 = new FileInputStream("copy.txt");
            FileOutputStream fos = new FileOutputStream("dontcopy.txt");

            int i;

            while ((i = fis1.read()) != -1) {
                fos.write(i);
            }

            fos.write("\n".getBytes());

            while ((i = fis2.read()) != -1) {
                fos.write(i);
            }

            fis1.close();
            fis2.close();
            fos.close();

            System.out.println("Data copied to dontcopy.txt successfully!\n");

            FileInputStream fis3 = new FileInputStream("dontcopy.txt");
            System.out.println("Content of dontcopy.txt:");

            while ((i = fis3.read()) != -1) {
                System.out.print((char) i);
            }

            fis3.close();

        } catch (IOException e) {
            System.out.println(e);
        }
    }
}