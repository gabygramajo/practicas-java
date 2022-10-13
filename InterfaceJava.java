class AnimalClass {
    String name;
    String breed;

    public AnimalClass(String name, String breed) {
        this.name = name;
        this.breed = breed;
    }
}
interface Pet {
    void eat();
}
interface Wild {
    void huntAndEat();
}
interface Canis {
    void howl();
}
class Doggie extends AnimalClass implements Pet, Canis{
    String owner;

    public Doggie(String name, String breed, String owner) {
        super(name, breed);
        this.owner = owner;
    }

    @Override
    public void eat() {
        System.out.println("time to eat croquettes Royal Canin");
    }

    @Override
    public void howl() {
        System.out.println("Howloowooooooo");
    }
}
class Wolf extends AnimalClass implements Wild, Canis {
    String subSpecies;

    public Wolf(String name, String subSpecies) {
        super(name, null);
        this.subSpecies = subSpecies;
    }

    @Override
    public void huntAndEat() {
        System.out.println("time to hunt and eat a hare");
    }

    @Override
    public void howl() {
        System.out.println("Howloowooooooo");
    }
}

public class InterfaceJava {
    public static void main(String[] args) {

        Doggie doggie = new Doggie("Firulais", "German shepherd", "Lucas Martínez");
        Wolf wolf = new Wolf("Shako", "Canis lupus occidentalis");

        doggie.eat();
        doggie.howl();
        wolf.huntAndEat();
    }
}
