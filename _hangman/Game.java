class Game {
    //answer is a private string to restrict access to this variable.  
    private String Answer;
    //private strings hits and misses will be used to designate a correct or incorrect guess.
    private String Hits;
    private String Misses;
    //create a construcgtor to pass the answer variable to the game;
    public Game(String Answer) {
        //specific instance of Answer created in constructor;
        this.Answer = Answer;
        //Hits and Misses flags used to designate correct and incorrect guesses in our game logic.
        Hits = "";
        Misses = "";
    }
    public boolean applyGuesses(char letter) {
        boolean isHit = Answer.indexOf(letter) != -1;
        //if our letter is contained in string conducted in above check then concatenate letter guess onto Hits variable otherwise concatenate onto Misses;
        if (isHit) {
            Hits += letter;
        } else {
            Misses += letter;
        }
        return isHit;
    }
    public String getCurrentProgress() {
        String progress = "";
        for(char letter: Answer.toCharArray()) {
            char display = '-';
            if(Hits.indexOf(letter)!=-1) {
                display = letter;
            }
            progress += display;
        }
        return progress;
    }
}