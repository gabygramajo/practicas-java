
class Animal {
    public void animalSound() {
        System.out.println("The animal makes a sound");
    }
}

class Pig extends Animal {
    @Override
    public void animalSound() {
        System.out.println("The pig says: wee wee");
    }
}

class Dog extends Animal {
    @Override
    public void animalSound() {
        System.out.println("The dog says: bow wow");
    }
}

public class MethodOverloading2 {
    public static void main(String[] args) {
        Animal anAnimal = new Animal();
        Animal pig = new Pig();
        Animal dog = new Dog();

        anAnimal.animalSound();
        //Out>> The animal makes a sound
        pig.animalSound();
        //Out>> The pig says: wee wee
        dog.animalSound();
        //Out>> The dog says: bow wow
    }
}
