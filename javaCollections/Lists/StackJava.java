package javaCollections.Lists;

import java.util.Stack;

public class StackJava {
    public static void main(String[] args) {

        Stack<String> myStack = new Stack<>();

        // push() agrega la un elemento en la parte superior de la pila.
        myStack.push("María");
        myStack.push("Lautaro");
        myStack.push("Miguel");
        myStack.push("Romina");
        myStack.push("Lucía");
        myStack.push("Sebastián");

        System.out.println("Stack: " + myStack); // out: [María, Laurato, Miguel, Romina, Lucía, Sebastián]

        // Obtener el item de la parte superior de la pila sin removerlo de la lista.
        System.out.println("Top item: " + myStack.peek() ); // out: Sebastián

        // pop() Elimina el item de la parte superior de la lista
        String deletedItem = myStack.pop();
        System.out.println( "Deleted item: " + deletedItem ); // out: Deleted item: Sebastián
        System.out.println( "Stack: " + myStack ); // out: [María, Laurato, Miguel, Romina, Lucía]

        // Validar si esta vacío
        System.out.println("It is empty?: " + myStack.empty() ); // out: It is empty?: false

        // search() Devuelve la posición del elemento desde la parte superior de la pila. De lo contrario, devuelve -1.
        System.out.println("" + myStack.search("Miguel") );
        System.out.println("" + myStack.search("Carlos") );
        System.out.println("" + myStack.search("Lautaro") );

    }
}
