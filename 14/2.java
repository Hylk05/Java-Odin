class B extends A {
    void testB() {
        a1 = 1;     // доступно (в том же пакете)
        a2 = 2;     // доступно (public)
        a3 = 3;     // доступно (protected)
        // a4 = 4;  // недоступно (private)

        method1();  // доступно (в том же пакете)
        method2();  // доступно (public)
        method3();  // доступно (protected)
        // method4(); // недоступно (private)
    }
}

class C extends B {
    void testC() {
        a1 = 1;     // доступно только если в том же пакете
        a2 = 2;     // доступно (public)
        a3 = 3;     // доступно (protected)
        // a4 = 4;  // недоступно (private)

        method1();  // доступно только если в том же пакете
        method2();  // доступно (public)
        method3();  // доступно (protected)
        // method4(); // недоступно (private)
    }
}