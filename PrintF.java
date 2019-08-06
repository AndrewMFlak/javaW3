import java.io.Console;

public class PrintF {
    public static void main(String[] args) {
        Console console = System.console();
        String myOutput = "print some shit here. ";
        console.printf(myOutput);
    }
}