package javaCollections.Sets;

import java.util.TreeSet;

public class TreeSetJava {

    public static void main(String[] args) {

        TreeSet<String> ts = new TreeSet<>();

        //add element
        ts.add("A");
        ts.add("B");
        ts.add("C");
        ts.add("D");

        System.out.println(ts);
        // out: [A, B, C, D]

        // print the first element
        System.out.println("First value: " + ts.first() );
        // First value: A

        // print the last element
        System.out.println("Last value: " + ts.last() );
        // Last value: D

        // check if the above string exists or not
        System.out.println("Exist C?: " + ts.contains("C") );
        // Exist C?: true
        System.out.println("Exist E?: " + ts.contains("E") );
        // Exist E?: false

        TreeSet<String> ts2 = new TreeSet<>();
        ts2.addAll(ts);
        ts2.add("E");
        ts2.add("a");
        ts2.add("Z");

        System.out.println(ts2); // [A, B, C, D, E, Z, a]

        // higher(E): return the least element strictly greater than the given element
        System.out.println("Higher than C: " + ts2.higher("C") );
        // Higher than C: D
        // lower(E): return the greater element strictly least than the given element
        System.out.println("Lower than C: " + ts2.lower("C") );
        // Lower than C: B

        //remove elements

        // pollFirst(): to remove the first element
        ts2.pollFirst(); // delete "A"

        // pollLast(): to remove the last element
        ts2.pollLast(); //delete "a"

        // remove any element with remove()
        ts2.remove("D"); // Delete D

        System.out.println("My TreeSet " + ts2 + " After removing \"A\", \"D\", \"a\" ");
        // My TreeSet [B, C, E, Z] without "A", "D", "a"
    }

}
