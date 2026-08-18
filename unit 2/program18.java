// Write a java program to use Multiple inheritance using interface.

// First interface
	
interface Speaker {
    void speak();
}

// Second interface
interface Runner {
    void run();
}

// Class implementing both interfaces
class Person implements Speaker, Runner {
    @Override
    public void speak() {
        System.out.println("Hello!");
    }

    @Override
    public void run() {
        System.out.println("Running fast!");
    }
}

// Main class to run the program
 class Multiinterface {
    public static void main(String[] args) {
        Person p = new Person();
        
        p.speak();
        p.run();
    }
}