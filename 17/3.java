class Base {
    void display() {
        System.out.println("Base");
    }
}

class Derived extends Base {
    @Override
    void display() { // Корректное переопределение
        System.out.println("Derived");
    }

    // @Override
    // void disply() { // Ошибка: опечатка в имени метода
    //     System.out.println("Misspelled");
    // }
}