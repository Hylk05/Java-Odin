import java.io.*;

public class FlushExample {
    public static void main(String[] args) throws IOException {
        FileWriter writer = new FileWriter("test.txt");
        writer.write("Some data");
        writer.flush(); // Принудительно записывает данные из буфера в файл
        writer.write("More data");
        writer.close(); // close() также вызывает flush()
    }
}