public class Pez {
    public static final int MAX_PEZ = 12;
    final private String characterName;
    private int pezCount;
    // To enter JShell in the command prompt use the command 'jshell';
    // To exit JShell from the command propmt use the command prompt '/exit'
    public Pez(String characterName) {
        this.characterName = characterName;
        pezCount = 0;
    };
    public void fill() {
        // changed from .....pezCount = MAX_PEZ;
        fill(MAX_PEZ);
    };
    public void fill(int pezAmount) {
        pezCount = pezAmount;
    };
    public boolean isEmpty() {
        return pezCount == 0;
    };
    public boolean dispense() {
        boolean wasDispensed = false;
        if (!isEmpty() == false) {
            pezCount--;
            System.out.println("Chomp!!!");
            // boolean used to flag state change after dispensing
            wasDispensed = true;
        };
        return wasDispensed;
    };
    public String getCharacterName() {
        return characterName;
    };
}

// To Run in jshell
// 1. start 'jshell' from command prompt;
// 2. '/open Pez.java' to open file;
// 3. 'Pez pd = new Pez("some string name");'
// '/exit' to leave jshell