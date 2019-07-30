public class Method {
    static void myMethod() {
        int number = 0;
        while (number < 101) {
            System.out.println(number);
            number = number + 10;
        }
    }

    public static void main(String[] args) {
        myMethod();
    };
}