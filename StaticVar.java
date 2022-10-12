public class StaticVar {

    //Esta variable reserva espacio de memoria una sola vez
    public static int contador = 0;

    public void Contador() {
        //el valor de la variable se incrementa en cada llamada de la función
        contador++;
        System.out.println(contador);
    }

    public static void main(String[] args) {
        //Ahora se crean instancias
        StaticVar Cont1 = new StaticVar();
        StaticVar Cont2 = new StaticVar();
        StaticVar Cont3 = new StaticVar();

        Cont1.Contador(); //Out>> 1
        Cont2.Contador(); //Out>> 2
        Cont3.Contador(); //Out>> 3

        Cont1.Contador(); //Out>> 4
    }
}
