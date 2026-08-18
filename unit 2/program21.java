// Class demonstrating encapsulation
class Student {
    // Private data members
    private String name;
    private int age;

    // Setter methods
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

// Main class
public class EncapsulationDemo {
    public static void main(String[] args) {
        Student s = new Student();

        // Setting values using setters
        s.setName("Rahul");
        s.setAge(20);

        // Getting values using getters
        System.out.println("Name: " + s.getName());
        System.out.println("Age: " + s.getAge());
    }
}