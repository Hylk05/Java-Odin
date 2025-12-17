public class StringConversions {
    public static void main(String[] args) {
        // String → StringBuilder/StringBuffer
        String str = "Hello";
        StringBuilder sb = new StringBuilder(str);
        StringBuffer sbf = new StringBuffer(str);

        // StringBuilder/StringBuffer → String
        String strFromSb = sb.toString();
        String strFromSbf = sbf.toString();

        // StringBuffer ↔ StringBuilder
        StringBuffer sbf2 = new StringBuffer(sb.toString());
        StringBuilder sb2 = new StringBuilder(sbf.toString());

        // Прямого преобразования между StringBuilder и StringBuffer нет
        // Только через String
    }
}