import java.io.*;

public class OutputStreamExample {
    public static void main(String[] args) throws IOException {
        ByteArrayOutputStream os = new ByteArrayOutputStream();

        for (int i = 65; i < 70; i++) {
            os.write(i);
        }

        byte[] result = os.toByteArray();
        System.out.println(new String(result));
        os.close();
    }
}