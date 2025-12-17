public class StringMethods {
    public static void main(String[] args) {
        String str = "Hello World";

        System.out.println(str.length()); // длина строки
        System.out.println(str.charAt(4)); // символ по индексу
        System.out.println(str.substring(6)); // подстрока с индекса
        System.out.println(str.substring(0, 5)); // подстрока от до
        System.out.println(str.indexOf('o')); // индекс первого вхождения
        System.out.println(str.lastIndexOf('o')); // индекс последнего вхождения
        System.out.println(str.toUpperCase()); // верхний регистр
        System.out.println(str.toLowerCase()); // нижний регистр
        System.out.println(str.replace('o', '0')); // замена символов
        System.out.println(str.contains("World")); // проверка содержания
        System.out.println(str.trim()); // удаление пробелов
        System.out.println(str.split(" ")[0]); // разделение строки
    }
}