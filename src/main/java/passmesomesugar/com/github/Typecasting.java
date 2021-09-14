package passmesomesugar.com.github;

public class Typecasting {
    public static void main(String[] args) {

        /* In Java, there are two types of casting:*/

    /* Widening Casting (automatically) - converting a smaller type to a larger type size
        byte -> short -> char -> int -> long -> float -> double
    */
        int someInteger = 9;
        double someDouble = someInteger;
        System.out.println("someInteger: " + someInteger);
        System.out.println("someInteger widened: " + someDouble);

    /* Narrowing Casting (manually) - converting a larger type to a smaller size type
        double -> float -> long -> int -> char -> short -> byte
    */
        double someOtherDouble = 2.6565;
        int someOtherInteger = (int) someOtherDouble;
        System.out.println("someOtherDouble: " + someOtherDouble);
        System.out.println("someOtherDouble narrowed: " + someOtherInteger);
    }
}
