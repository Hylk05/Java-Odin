class Animal {
    Animal getAnimal() {
        return new Animal();
    }
}

class Dog extends Animal {
    @Override
    Dog getAnimal() { // Ковариантный возвращаемый тип
        return new Dog();
    }
}

// Если типы несовместимы - ошибка компиляции:
// class Cat extends Animal {
//     @Override
//     String getAnimal() { // Ошибка: несовместимый тип возврата
//         return "Cat";
//     }
// }