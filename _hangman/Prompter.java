import java.util.Scanner;

class Prompter {
    private Game game;

    public Prompter(Game game) {
        this.game = game;
    }

    public boolean promptForGuess() {
        //create new instance of scanner object we imported
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a letter:  ");
        //use scanner to capture out input
        String guessInput = scanner.nextLine();
        char guess = guessInput.charAt(0);
        return game.applyGuesses(guess);
    }
    public void displayProgress() {
        System.out.printf("Try to solve: %s%n",game.getCurrentProgress());
    }
}