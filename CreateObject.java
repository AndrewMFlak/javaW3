public class CreateObject {
    static void printFunction() {
        System.out.println("Hello there!  Welcome to Java!!!");
    }

    static void printConclusion() {
        System.out.println("Your java canned function has finished running.  Keep at it.  Rome was not built in a day.");
    }

    public void doSomeShit() {
        long number = 0;
        while (number < 1000001) {
            System.out.println(number);
            number = number + 10000;
        }

    }

    public static void main(String[] args) {
        printFunction();
        CreateObject someObject = new CreateObject();
        someObject.doSomeShit();
        printConclusion();
    }
}