 class FinallyExample {
    public static void main(String[] args) {
        try {
            int result = 10 / 0; // Throws an ArithmeticException
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero!");
        } finally {
            // This block ALWAYS runs, whether an exception happens or not
            System.out.println("Finally block executed.");
        }
    }
}