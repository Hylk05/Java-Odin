import java.util.Date;
import java.util.Formatter;

public class DateTimeFormat {
    public static void main(String[] args) {
        Date now = new Date();
        Formatter fmt = new Formatter();

        fmt.format("Hours (24): %tH%n", now);
        fmt.format("Minutes: %tM%n", now);
        fmt.format("Seconds: %tS%n", now);
        fmt.format("Year: %tY%n", now);
        fmt.format("Month: %tB%n", now);

        System.out.println(fmt);
        fmt.close();
    }
}