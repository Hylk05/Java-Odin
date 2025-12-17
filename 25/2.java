public class FinalCatch {
    public static void main(String[] args) {
        try {
            // код
        } catch (final Exception e) {
            // final запрещает переприсваивание переменной e
            // e = new Exception(); // Ошибка компиляции
            System.out.println(e.getMessage());
        }

        // Вложенные try-catch
        try {
            try {
                int[] arr = new int[5];
                arr[10] = 1;
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Внутренний catch");
                throw e; // повторный выброс исключения
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Внешний catch");
        }
    }
}