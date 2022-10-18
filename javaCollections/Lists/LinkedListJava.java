package javaCollections.Lists;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListJava {
    public static void main(String[] args) {

        LinkedList<String> list1 = new LinkedList<>();

        list1.add("item 3");
        list1.add("item 4");
        list1.add("item 5");
        System.out.println(list1); // out: [item 3, item 4]

        // Adds an item to the beginning of the list.
        list1.addFirst("addFirst");

        // Add an item to the end of the list
        list1.addLast("addLast");

        System.out.println(list1); // out: [addFirst, item 3, item 4, addLast]

        // Remove an item from the beginning of the list.
        String delFirstItem = list1.removeFirst();
        System.out.println("Deleted item: " + delFirstItem); // out: Deleted item: addFirst
        
        // Remove an item from the end of the list
        String delLastItem = list1.removeLast();
        System.out.println("Deleted item: " + delLastItem); // out: Deleted item: addLast
        
        // Get the item at the beginning of the list
        String item = list1.getFirst();
        System.out.println( "First element: " + item); // out: First element: item 3

        // Get the item at the end of the list
        item = list1.getLast();
        System.out.println( "Last element: " + item); // out: Last element: item 5

        // ArrayList to LinkedList
        ArrayList<String> list2 = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            list2.add("Element"+i);
        }

        LinkedList<String> list3 = new LinkedList<>(list2);
        System.out.println(list3); // out: [Element0, Element1, Element2]
    }
}
