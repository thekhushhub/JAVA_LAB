// Write a java program to perform overriding of abstract class

// Abstract class
abstract class Animal {
    // Abstract method
    abstract void sound();
}

// Subclass that overrides the abstract method
class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

// Main class
class AbstractOverride {
    public static void main(String[] args) {
        Animal obj = new Dog();
        obj.sound();
    }
}