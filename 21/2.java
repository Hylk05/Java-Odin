import java.util.StringJoiner;

public class StringJoinerExample {
    public static void main(String[] args) {
        StringJoiner sj1 = new StringJoiner(", ", "[", "]");
        sj1.add("Apple").add("Banana").add("Orange");
        System.out.println(sj1.toString());

        StringJoiner sj2 = new StringJoiner("; ");
        sj2.add("One").add("Two").add("Three");
        System.out.println(sj2.toString());

        StringJoiner merged = sj1.merge(sj2);
        System.out.println(merged.toString());
    }
}