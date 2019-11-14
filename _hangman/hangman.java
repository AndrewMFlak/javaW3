public class hangman {
    public static void main(String[] args) {
        //Object Game passed in here and named "game" as a new instance;
        Game game = new Game("treehouse");
        Prompter prompter = new Prompter(game);
        prompter.displayProgress();
        boolean isHit = prompter.promptForGuess();
        if(isHit) {
            System.out.println("We got a hit!");
        } else {
            System.out.println("Oops missed!");
        }
        prompter.displayProgress();
    }

}