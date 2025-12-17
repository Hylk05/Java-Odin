class Parent {
    void display() {
        System.out.println("Parent display");
    }

    void display(String message) {
        System.out.println("Parent: " + message);
    }

    void show() {
        System.out.println("Parent show");
    }
}

class Child extends Parent {
    @Override
    void show() {
        System.out.println("Child show");
    }

    void display(int number) {
        System.out.println("Child: " + number);
    }
}

public class Main {
    public static void main(String[] args) {
        Parent parent = new Parent();
        parent.display();
        parent.display("Hello");

        Child child = new Child();
        child.show();
        child.display();
        child.display("World");
        child.display(100);
    }
}