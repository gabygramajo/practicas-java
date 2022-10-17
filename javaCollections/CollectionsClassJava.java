package javaCollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsClassJava {
    public static void main(String[] args) {

        List<String> listNames = new ArrayList<>();

        Collections.addAll(listNames, "Barbara", "Lucas", "Angela","Miguel", "Flor", "Juan");
        System.out.println(listNames);

        //Ordenar Elementos
        Collections.sort(listNames);
        System.out.println(listNames);

        // Orden inverso de elementos
        Collections.sort(listNames, Collections.reverseOrder());
        System.out.println(listNames);

        // Buscar un elemento
        Collections.sort(listNames);
        System.out.println( "Indice de Flor es: " +
                Collections.binarySearch(listNames, "Flor")
                );
        System.out.println( "Indice de noExiste es: " +
                Collections.binarySearch(listNames, "Carlos")
                );
        System.out.println( listNames.indexOf("For") );
    }
}
