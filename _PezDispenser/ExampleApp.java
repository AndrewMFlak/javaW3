public class ExampleApp {
    public static void main(String[] args) {
        System.out.println("We have created a virtual Pez Dispenser");
        System.out.printf("Fun Fact: There are %d PEX allowed in every dispenser %n", Pez.MAX_PEZ);
        Pez dispenser = new Pez("Luke");
        System.out.printf("The dispenser is %s %n", dispenser.getCharacterName());
        
        if(!dispenser.isEmpty()) {
            System.out.println("Dispenser is empty");
        }
        System.out.println("Filling the dispneser with PEZ...");
        dispenser.fill();
        if(!dispenser.isEmpty()) {
            System.out.println("My Pez dispenser is full!!!");
        }
    }

}