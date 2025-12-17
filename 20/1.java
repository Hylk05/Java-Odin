interface MyInterface {
    default void defaultMethod() {
        System.out.println("Default method");
    }

    static void staticMethod() {
        System.out.println("Static method");
    }
}

class MyClass implements MyInterface {
    // defaultMethod можно переопределить, а можно и нет
}

public class Main {
    public static void main(String[] args) {
        MyClass obj = new MyClass();
        obj.defaultMethod(); // вызов default метода
        MyInterface.staticMethod(); // вызов static метода

        MyInterface.staticMethod(); // только через имя интерфейса
    }
}