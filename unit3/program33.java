class Outer {
    void show() {

        class Inner {
            void msg() {
                System.out.println("Hello from Local Inner Class!");
            }
        }

        Inner in = new Inner();
        in.msg();
    }
}

 class Main {
    public static void main(String[] args) {
        Outer out = new Outer();
        out.show();
    }
}
