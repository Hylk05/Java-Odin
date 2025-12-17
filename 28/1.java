import java.io.*;

public class InputStreamExample {
    public static void main(String[] args) throws IOException {
        byte[] data = {65, 66, 67, 68, 69};
        InputStream is = new ByteArrayInputStream(data);

        int byteRead;
        while ((byteRead = is.read()) != -1) {
            System.out.print((char) byteRead + " ");
        }
        is.close();
    }
}