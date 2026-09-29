 class program29 {

    // Method 1: Throws the exception
    static void method1() {
        int data = 50 / 0; // ArithmeticException happens here
    }

    // Method 2: Calls method1, doesn't handle it, so exception propagates up
    static void method2() {
        method1();
    }

    // Method 3: Catches the propagated exception
    public static void main(String[] args) {
        try {
            method2();
        } catch (ArithmeticException e) {
            System.out.println("Exception caught in main method: " + e);
        }
    }
}