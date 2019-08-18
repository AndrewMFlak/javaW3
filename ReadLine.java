import java.io.Console;

public class ReadLine {
    public static void main(String[] args) {
        Console console = System.console();
        String name = console.readLine("Insert your name here...  ");
        String adjective = console.readLine("Insert an adjective... ");
        // console.printf("%s is ver %s", name, adjective);
        System.out.println(name +" is very "+ adjective);


    }
}