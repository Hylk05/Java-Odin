// Да, try с finally допустима
public class TryFinally {
    public static void main(String[] args) {
        try {
            System.out.println("Inside try");
        } finally {
            System.out.println("Inside finally");
        }
    }
}