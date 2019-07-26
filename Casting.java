

// Widening Casting (automatically) - converting a smaller type to a larger type size
// byte -> short -> char -> int -> long -> float -> double

// Narrowing Casting (manually) - converting a larger type to a smaller size type
// double -> float -> long -> int -> char -> short -> byte
public class Casting {
    public static void main(String[] args) {
        double nav = 1500000.564321;
        byte ohYeah = 69;
        // example of widening casting
        double ohYeahNav = nav + ohYeah;
        // example of narrowing cast
        int narrowed = (int)ohYeahNav;
        System.out.println(narrowed);

    }
}