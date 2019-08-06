public class Continue {
    public static void main(String[] args) {
        int stopValue = 55;
        int i = 0;
        String successful = "Found that shit.  ";
        while (i<100) {
            System.out.println(i);
            if(i == stopValue) {
                System.out.println(successful);
                break;
            }
            i++;
        }
    }
}