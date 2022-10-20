package javaCollections.Sets;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class LinkedHashSetJava {
    public static void main(String[] args) {
        HashSet<String> fastFoodRestaurants1 = new HashSet<>();

        // add items
        fastFoodRestaurants1.add("McDonald’s");
        fastFoodRestaurants1.add("KFC");
        fastFoodRestaurants1.add("Burger King");
        fastFoodRestaurants1.add("Pizza Hut");
        fastFoodRestaurants1.add("Subway");

        LinkedHashSet<String> fastFoodRestaurants2 = new LinkedHashSet<>();
        // add items
        fastFoodRestaurants2.add("McDonald’s");
        fastFoodRestaurants2.add("KFC");
        fastFoodRestaurants2.add("Burger King");
        fastFoodRestaurants2.add("Pizza Hut");
        fastFoodRestaurants2.add("Subway");

        System.out.println( "HashSet: " + fastFoodRestaurants1 +
                "\nLinkedHashSet: " + fastFoodRestaurants2);
        /*out:
        HashSet:        [Pizza Hut, McDonald’s, KFC, Subway, Burger King]
        LinkedHashSet:  [McDonald’s, KFC, Burger King, Pizza Hut, Subway]
         */

    }
}
