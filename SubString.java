public class SubString {
    public static void main(String[] args) {
        String s = "Lionel Messi";
        String name = s.substring(0, s.indexOf(" "));
        String lastName = s.substring(s.indexOf(" ") + 1, s.length());
        String nameSwapped = lastName + " " + name;
        System.out.println(nameSwapped);
        // substring permite extraer una sub cadena indicandole un indice incial y final
        //System.out.println( s.substring(7, s.length()) );
        // indexOf() retorna el indice de elemento señalado
        //System.out.println(s.indexOf(" "));
    }
}
