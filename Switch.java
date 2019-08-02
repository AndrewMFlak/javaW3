public class Switch {
    // static void closer(){
    //     System.out.println("Fuck yes this is a java app!");
    // }
    // public static void main(String[] args) {
    //     int aNumber = 0;
    //     while(aNumber < 101) {
    //         System.out.println(aNumber);
    //         aNumber++;
    //     };
    //     closer();
    // }
    public static void main(String[] args) {
        int someNumber = 10;
        
        switch(someNumber) {
            case 0:
                System.out.println("Your number is " + 0);
                break;
            case 5:
                System.out.println("Your number is " + 5);
                break;
            case 10: 
                System.out.println("Your number is " + 10);
                break;
            default:
                System.out.println("Default value selected biatch!");
        }
    }
}