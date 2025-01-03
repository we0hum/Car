package test_rectangle;

import java.util.Random;
import java.io.File;
import java.io.PrintWriter;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class WriteToFile {
    public static void main(String[] args) {
        BufferedReader br = null;
        try {
            File file = new File("TestWriteToFile");
            PrintWriter pw = new PrintWriter(file);
            Random random = new Random();

            for (int i = 0; i < 10; i++) {
                for (int j = 0; j < 1; j++) {
                    pw.println(random.nextInt(100));
                }
            }
            pw.close();

            br = new BufferedReader(new FileReader("TestWriteToFile"));
            String line;
            int a = 1;
                while ((line = br.readLine()) != null) {
                    System.out.print("Значение " + a + " равно: ");
                    System.out.println(line);
                    a++;
            }
        }
        catch (IOException e) {
            System.out.println("Ошибка: " + e);
        }
        finally {
            try {
                br.close();
            } catch (IOException e) {
                System.out.println("Ошибка: " + e);
            }
        }
    }
}
