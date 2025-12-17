public class ExceptionExamples {
    public static void main(String[] args) {
        // ArithmeticException
        try {
            int result = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException caught");
        }

        // ArrayIndexOutOfBoundsException
        try {
            int[] arr = {1, 2, 3};
            int value = arr[5];
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException caught");
        }

        // IllegalArgumentException
        try {
            setAge(-5);
        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException caught");
        }

        // ClassCastException
        try {
            Object obj = "String";
            Integer num = (Integer) obj;
        } catch (ClassCastException e) {
            System.out.println("ClassCastException caught");
        }

        // NullPointerException
        try {
            String str = null;
            int length = str.length();
        } catch (NullPointerException e) {
            System.out.println("NullPointerException caught");
        }
    }

    static void setAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Age cannot be negative");
        }
    }
}