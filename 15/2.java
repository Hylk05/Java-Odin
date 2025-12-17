final class FinalClass {
    public void show() {
        System.out.println("Final class method");
    }
}

// Ошибка компиляции: нельзя наследовать от final класса
// class ChildClass extends FinalClass {
//     // код класса
// }