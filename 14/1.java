class Parent {
    int value = 10;

    void display() {
        System.out.println("Parent");
    }
}

class Child extends Parent {
    int value = 20;

    void display() {
        super.display(); // вызов метода родителя
        System.out.println("Child");
        System.out.println("Parent value: " + super.value);
        System.out.println("Child value: " + this.value);
    }

    void show() {
        this.display(); // вызов метода текущего объекта
    }
}