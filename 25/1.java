public class MultipleCatch {
    public static void main(String[] args) {
        // 1. Одинаковая обработка нескольких исключений
        try {
            // код, который может выбросить разные исключения
        } catch (ArithmeticException | NullPointerException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }

        // 2. Иерархия исключений
        try {
            // код
        } catch (RuntimeException e3) { // Ex3
            System.out.println("Обработка RuntimeException");
        } catch (Exception e2) { // Ex2
            System.out.println("Обработка Exception");
        } catch (Throwable e1) { // Ex1
            System.out.println("Обработка Throwable");
        }
    }
}