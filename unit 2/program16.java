// Write a java program to use Abstract class

// Abstract class

abstract class Animal {
    // Abstract method (has no body)
    abstract void makeSound();

    // Regular/Concrete method
    void sleep() {
        System.out.println("Sleeping... Zzz");
    }
}

// Subclass providing the implementation
class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("The dog says: Woof Woof");
    }
}

// Main class to run the program
class Abstract {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        
        myDog.makeSound(); // Calls overridden abstract method
        myDog.sleep();     // Calls inherited regular method
    }
}