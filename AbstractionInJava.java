// Abstract class Animal
abstract class Animal {
    // Abstract method
    public abstract void sound();

    // Common method
    public void eat() {
        System.out.println("This animal is eating.");
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

// Main class to demonstrate abstraction
public class AbstractionInJava {
    public static void main(String[] args) {
        // Create instances of each class
        Animal dog = new Dog();
        Animal cat = new Cat();
        Animal woof = new Woof();
        Animal cow = new Cow();

        // Call the sound method for each instance
        System.out.println("Dog Sound:");
        dog.sound();
        dog.eat();

        System.out.println("\nCat Sound:");
        cat.sound();
        cat.eat();

        System.out.println("\nWoof Sound:");
        woof.sound();
        woof.eat();

        System.out.println("\nCow Sound:");
        cow.sound();
        cow.eat();
    }
}
