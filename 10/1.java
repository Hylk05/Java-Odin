public class Main {
    public static void main(String[] args) {
        A.printVars();

        A obj = new A();
        obj.printVars();

        new A().printVars();
    }
}