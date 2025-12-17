interface InterfaceA {
    default void show() {
        System.out.println("InterfaceA");
    }
}

interface InterfaceB {
    default void show() {
        System.out.println("InterfaceB");
    }
}

class MyClass implements InterfaceA, InterfaceB {
    // Ошибка компиляции: конфликт default методов
    // Решение: явно переопределить метод
    @Override
    public void show() {
        InterfaceA.super.show(); // можно вызвать конкретную реализацию
        InterfaceB.super.show(); // или другую
        System.out.println("MyClass implementation");
    }
}