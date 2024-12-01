// Base class Animal
class Animal {
    public void sound() {
        System.out.println("Some generic animal sound");
    }
}

// Dog class extending Animal
class Dog extends Animal {
    @Override
    public void sound() {
        System.out.println("Bhoww Bhoww");
    }
}

// Cat class extending Animal
class Cat extends Animal {
    @Override
    public void sound() {
        System.out.println("Meow Meow");
    }
}

// Woof class extending Animal
class Woof extends Animal {
    @Override
    public void sound() {
        System.out.println("Woof Woof");
    }
}

// Cow class extending Animal
class Cow extends Animal {
    @Override
    public void sound() {
        System.out.println("Moo Jiii");
    }
}

// Main class to demonstrate inheritance
public class InheritanceInJava {
    public static void main(String[] args) {
        // Create instances of each class
        Animal genericAnimal = new Animal();
        Animal dog = new Dog();
        Animal cat = new Cat();
        Animal woof = new Woof();
        Animal cow = new Cow();

        // Call the sound method for each instance
        System.out.println("Generic Animal Sound:");
        genericAnimal.sound();

        System.out.println("\nDog Sound:");
        dog.sound();

        System.out.println("\nCat Sound:");
        cat.sound();

        System.out.println("\nWoof Sound:");
        woof.sound();

        System.out.println("\nCow Sound:");
        cow.sound();
    }
}
