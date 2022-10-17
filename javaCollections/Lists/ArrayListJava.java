package javaCollections.Lists;

import java.util.ArrayList;

public class ArrayListJava {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        // agregar items con add
        for (int i = 1; i <= 5; i++) {
            list.add("Item " + i );
        }
        System.out.println(list); // out >> [Item 1, Item 2, Item 3, Item 4, Item 5]

        // remover un elemento con remove
        list.remove(2);
        System.out.println(list); // out >> [Item 1, Item 2, Item 4, Item 5]

        // Obtener un elemento mediante su indice con get
        System.out.println( list.get(2) ); // out >> Item 4

        // Inicializar un ArrayList con elementos de otro ArrayList pasándola por parámetro en el contructor
        ArrayList<String> list2 = new ArrayList<>(list);
        System.out.println(list2); // out >> [Item 1, Item 2, Item 4, Item 5]
        list2.add(2, "Item 3");
        list2.remove(0);
        System.out.println(list2); // out >> [Item 2, Item 3, Item 4, Item 5]
        System.out.println(list); // out >> [Item 1, Item 2, Item 4, Item 5] list sigue igual.

    }
}
