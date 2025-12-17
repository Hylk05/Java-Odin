package pack1;

class SamePackageClass {
    void test() {
        AccessExample obj = new AccessExample();
        System.out.println(obj.publicVar);
        System.out.println(obj.protectedVar);
        System.out.println(obj.defaultVar);
        // System.out.println(obj.privateVar); // Ошибка
    }
}