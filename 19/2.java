public class Outer {
    private String privateField = "private";
    protected String protectedField = "protected";
    String packageField = "package";
    public String publicField = "public";

    public class Inner {
        void accessOuter() {
            System.out.println(privateField); // Доступно
            System.out.println(protectedField); // Доступно
            System.out.println(packageField); // Доступно
            System.out.println(publicField); // Доступно
        }
    }
}