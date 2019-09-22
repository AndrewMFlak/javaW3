public class ExampleApp {
    public static void main(String[] args) {
        System.out.println("We have created a virtual Pez Dispenser here using Java application");
        System.out.println("/n");
        System.out.printf("Fun Fact: There are %d PEZ allowed in every dispenser %n", Pez.MAX_PEZ);
        Pez dispenser = new Pez("Luke");
        System.out.printf("This pez dispenser character name is %s %n", dispenser.getCharacterName());
        
        if(!dispenser.isEmpty()) {
            System.out.println("Dispenser is empty");
        }
        System.out.println("Filling the dispneser with PEZ...");
        dispenser.fill();
        if(!dispenser.isEmpty()) {
            System.out.println("My Pez dispenser is full!!!");
        }
        while( dispenser.dispense()) {
            //System.out.println("Chomp!!!");
        }
        System.out.println("Yum!  That is some tasty Pez");
    }

}