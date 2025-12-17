public class Outer {
    public class PublicInner {}
    protected class ProtectedInner {}
    class PackagePrivateInner {}
    private class PrivateInner {}
}

class Test {
    void test() {
        Outer outer = new Outer();
        Outer.PublicInner pi = outer.new PublicInner();
        Outer.ProtectedInner proi = outer.new ProtectedInner();
        Outer.PackagePrivateInner ppi = outer.new PackagePrivateInner();
        // Outer.PrivateInner pri = outer.new PrivateInner(); // Ошибка
    }
}