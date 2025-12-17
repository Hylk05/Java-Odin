class A {
    int a = 1;
    void method() {
        System.out.println("A method");
    }
}

class B extends A {
    // пустой класс
}

class C extends B {
    void method() {
        int a = super.a; // получит значение из класса A (1)
        super.method(); // вызовет method() из класса A
    }
}
// Вызов super.a и super.method() будет работать, так как они наследуются из A через B