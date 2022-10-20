package javaCollections.Sets;

import java.util.HashSet;
import java.util.function.Consumer;

public class HashSetJava {

    public static void main(String[] args) {

        HashSet<String> fastFoodRestaurants = new HashSet<>();

        // add items
        fastFoodRestaurants.add("McDonald’s");
        fastFoodRestaurants.add("KFC");
        fastFoodRestaurants.add("Burger King");
        fastFoodRestaurants.add("Pizza Hut");
        fastFoodRestaurants.add("Subway");

        System.out.println(fastFoodRestaurants);
        //out: [Pizza Hut, McDonald’s, KFC, Subway, Burger King]

        // remove item
        fastFoodRestaurants.remove("Pizza Hut");
        System.out.println(fastFoodRestaurants);
        //out: [McDonald’s, KFC, Subway, Burger King]

        // Comprobar si existe un elemento
        System.out.println( "Contiene mostaza?: " + fastFoodRestaurants.contains("Mostaza") );
        // out: Contiene mostaza?: false

        // tamaño
        System.out.println( "Tamaño: " + fastFoodRestaurants.size() );
        // out: Tamaño: 4

        // using forEach
        fastFoodRestaurants.forEach(new Consumer<String>() {
            @Override
            public void accept(String restaurant) {
                System.out.println("Restaurant: " + restaurant);
            }
        });
        /*
        Restaurant: McDonald’s
        Restaurant: KFC
        Restaurant: Subway
        Restaurant: Burger King
        * */
    }

}
