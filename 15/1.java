class Parent {
    public final void finalMethod() {
        System.out.println("This is final method");
    }
}

class Child extends Parent {
    // Ошибка компиляции: нельзя переопределить final метод
    // public void finalMethod() {
    //     System.out.println("Trying to override");
    // }
}