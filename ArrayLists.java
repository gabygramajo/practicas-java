import java.util.ArrayList;
import java.util.List;

public class ArrayLists {
    public static void main(String[] args) {
        // sintaxis List<TipoDeDato> ListNombre
        //Ej: List<String> nombres = new ArrayList<String>();

        List<Persona> personas = new ArrayList<Persona>();
        personas.add(new Persona(1, "Adrian Gomez", 23, "masculino"));
        personas.add(new Persona(2, "Luisa Martinez", 31, "femenino"));
        personas.add(new Persona(3, "Miguel Rojas", 28,"masculino"));
        personas.add(new Persona(4, "Marcela Dominguez", 26, "femenino"));

        //Recorrer por índice
        for (int i = 0; i < personas.size(); i++) {
            System.out.println(personas.get(i).printInfo());
        }

        //recorrido foreach
        for (Persona persona:personas) {
            System.out.println(persona.printInfo());
        }
    }
}
/*
- Las listas son un conjunto de elementos relacionados entre si que tienen un determiando orden.
- Su tamaño es dinámico(Puede cambiar en el tiempo)
En java existen diferentes tipos de listas:
- ArrayLists.
- LinkedLists.
- Stacks.
 */