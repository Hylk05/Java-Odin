class Parent {
    String value = "Parent";

    Parent(String msg) {
        System.out.println("Parent constructor: " + msg);
    }

    void show() {
        System.out.println("Parent method");
    }
}

class Child extends Parent {
    String value = "Child";

    Child() {
        super("Hello"); // вызов конструктора суперкласса
    }

    void display() {
        System.out.println(super.value); // доступ к полю суперкласса
        super.show(); // доступ к методу суперкласса
        System.out.println(this.value);
    }
}