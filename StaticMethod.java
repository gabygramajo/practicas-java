public class StaticMethod {

    //creamos un método que va a multiplicar dos números que se le pasen como parámetros
    public static int multiplicar(int num1, int num2) {
        return num1 * num2;
    }

    public static void main(String[] args) {
        // Accedemos al método a través de su clase sin instanciar.
        System.out.println("Multiplicación: " + StaticMethod.multiplicar(7, 4));

        System.out.println("Multiplicación: " + StaticMethod.multiplicar(9, 10));
    }

}
