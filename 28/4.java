import java.io.*;

public class AutoCloseableExample {
    public static void main(String[] args) {
        // try-with-resources автоматически закрывает ресурсы
        try (FileInputStream fis = new FileInputStream("test.txt");
             FileOutputStream fos = new FileOutputStream("output.txt")) {

            int data;
            while ((data = fis.read()) != -1) {
                fos.write(data);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        // Ресурсы закрываются автоматически
    }
}