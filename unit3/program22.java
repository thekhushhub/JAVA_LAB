class Main {
    public static void main(String[] args) {
        try {
            int numbers[] = {1, 2, 3};
            System.out.println(numbers[5]); // Trying to access an element that doesn't exist
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Array index out of bounds!");
        }
    }
}