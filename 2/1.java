/**
 * Этот класс демонстрирует использование javadoc-комментариев.
 * @author Артём Боровиков
 * @version 1.0
 */
public class JavadocExample {

    /**
     * Константа класса.
     */
    public static final int CONSTANT = 100;

    /**
     * Основной метод программы.
     * @param args аргументы командной строки
     */
    public static void main(String[] args) {
        int result = calculate(5, 3);
        System.out.println("Результат: " + result);
    }

    /**
     * Вычисляет сумму двух чисел.
     * @param a первое число
     * @param b второе число
     * @return сумма a и b
     * @throws IllegalArgumentException если a меньше 0
     */
    public static int calculate(int a, int b) {
        if (a < 0) {
            throw new IllegalArgumentException("a не может быть отрицательным");
        }
        return a + b;
    }
}