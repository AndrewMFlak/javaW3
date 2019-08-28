class Pez {

    // To enter JShell in the command prompt use the command 'jshell';
    // To exit JShell from the command propmt use the command prompt '/exit'
    public static final int MAX_BARS = 12;
    final private String characterName;
    private int pezCount;
    public Pez(String characterName) {
        this.characterName = characterName;
        pezCount = 0;

    }
    public int fill() {
        return pezCount = MAX_BARS;
    }
    public boolean isEmpty() {
        return pezCount==0;
    }
    public String getCharacterName() {
        return characterName;
    }

}


//To Run in jshell
//1. start 'jshell' from command prompt;
//2. '/open Pez.java' to open file;
//3. 'Pez pd = new Pez("some string name");'
//   '/exit' to leave jshell