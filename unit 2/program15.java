//write a java program to  use hirearchical inheritance
// parent class

class parent {
    void showparent() {
        
    }
}//  Write a java program to use Hierarchical inheritance 

// Parent Class
class Parent {
    void showParent() {
        System.out.println("Parent Class");
    }
}

// First Child Class
class ChildA extends Parent {
    void showChildA() {
        System.out.println("Child A Class");
    }
}

// Second Child Class
class ChildB extends Parent {
    void showChildB() {
        System.out.println("Child B Class");
    }
}

// Main Class
class Hierarchicalinheritance {
    public static void main(String[] args) {
        ChildA objA = new ChildA();
        objA.showParent(); // Inherited from Parent
        objA.showChildA();

        ChildB objB = new ChildB();
        objB.showParent(); // Inherited from Parent
        objB.showChildB();
    }
}