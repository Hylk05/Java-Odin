import java.io.*;

public class ReaderWriterExample {
    public static void main(String[] args) throws IOException {
        // Reader/Writer работают с символами (Unicode), а InputStream/OutputStream с байтами
        String text = "Привет мир!";

        // Чтение символов
        Reader reader = new StringReader(text);
        int charRead;
        while ((charRead = reader.read()) != -1) {
            System.out.print((char) charRead);
        }
        reader.close();

        // Запись символов
        Writer writer = new StringWriter();
        writer.write(text);
        writer.close();
    }
}