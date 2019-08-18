public class JShell {
    public static void main(String[] args) {
        String someWords = "HERE are some words";
        System.out.println(someWords.equals("something"));
        // boolean if equals return true
        System.out.println(someWords.contains("here"));
        boolean loweredSomeWords = someWords.toLowerCase().contains("here");
        System.out.println(loweredSomeWords);


    }
}