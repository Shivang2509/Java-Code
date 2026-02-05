// Program to implement Run-Time Polymorphism

class Animal {

    // Method in Parent class
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

// Child class 1
class Dog extends Animal {

    // Overriding Parent class method
    void sound() {
        System.out.println("Dog barks");
    }
}

// Child class 2
class Cat extends Animal {

    // Overriding Parent class method
    void sound() {
        System.out.println("Cat meows");
    }
}

public class RuntimePolymorphism {

    public static void main(String[] args) {

        // Parent class reference and Child class object
        Animal a;

        a = new Dog();   // Dog object
        a.sound();       // Calls Dog's sound()

        a = new Cat();   // Cat object
        a.sound();       // Calls Cat's sound()
    }
}
