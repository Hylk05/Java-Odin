public class VarArgsExample {
    public static void print(int... numbers) {
        System.out.println("int varargs: " + numbers.length);
    }

    public static void print(String... strings) {
        System.out.println("String varargs: " + strings.length);
    }

    public static void print(int a, String... strings) {
        System.out.println("mixed: " + a + ", " + strings.length + " strings");
    }

    public static void print(Object... objects) {
        System.out.println("Object varargs: " + objects.length);
    }

    public static void main(String[] args) {
        print(1, 2, 3);
        print("a", "b", "c");
        print(10, "x", "y");
        print(new Object[]{1, "test", 3.14});
    }
}