public class MethodOverloading {
    // SobreCarga de métodos - Polimorfismo

    public static void main(String[] args) {
        // int
        Sum(1, 3);
        // double
        Sum(2.5, 3.5);
        // int and double
        Sum(9, 3.5);
        // 3 parameters
        Sum(2,4, 8);

    }
    // Sum Overloading
    static void Sum(int a, int b) {
        System.out.println("Suma int: " + ( a + b ));
    }

    static void Sum(double a, double b) {
        System.out.println("Suma double: " + ( a + b ));
    }

    static void Sum(int a, double b) {
        System.out.println("Suma int + double: " + ( a + b ));
    }

    static void Sum(int a, int b, int c) {
        System.out.println("Suma 3: " + ( a + b + c ));
    }
}
