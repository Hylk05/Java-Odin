import java.util.Formatter;

public class FormatExample {
    public static void main(String[] args) {
        Formatter fmt = new Formatter();

        fmt.format("Boolean: %b%n", true);
        fmt.format("Character: %c%n", 'A');
        fmt.format("Integer: %d%n", 100);
        fmt.format("Float: %.2f%n", 3.14159);
        fmt.format("String: %s%n", "Hello");
        fmt.format("Percent: %% %n");

        System.out.println(fmt);
        fmt.close();
    }
}