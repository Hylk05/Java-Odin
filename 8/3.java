package pack2;

import pack1.AccessExample;

class DifferentPackageClass extends AccessExample {
    void test() {
        AccessExample obj = new AccessExample();
        System.out.println(obj.publicVar);
        // System.out.println(obj.protectedVar); // Ошибка
        // System.out.println(obj.defaultVar); // Ошибка
        // System.out.println(obj.privateVar); // Ошибка

        DifferentPackageClass child = new DifferentPackageClass();
        System.out.println(child.protectedVar);
    }
}