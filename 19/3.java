public class Outer {
    public void accessInner() {
        Inner inner = new Inner();
        System.out.println(inner.publicField); // Доступно
        System.out.println(inner.protectedField); // Доступно
        System.out.println(inner.packageField); // Доступно
        // System.out.println(inner.privateField); // Ошибка
    }

    public class Inner {
        private String privateField = "private";
        protected String protectedField = "protected";
        String packageField = "package";
        public String publicField = "public";
    }
}