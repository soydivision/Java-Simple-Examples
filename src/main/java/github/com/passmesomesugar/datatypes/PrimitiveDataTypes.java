package github.com.passmesomesugar.datatypes;

public class PrimitiveDataTypes {
    public static void main(String[] args) {

        /* stored in memory as: one bit */
        boolean isTrueBoolean = true;
        System.out.println("isTrueBoolean: " + isTrueBoolean);
        System.out.println("!isTrueBoolean: " + !isTrueBoolean);

        /* stored in memory as: 16 bits (Unicode character) */
        char character = 'A'; // not "A"
        System.out.println("character: " + character);

        /* stored in memory as: one byte (1 sign bit + 7 bits),
        number range (-2^7, 2^7-1) ~ (-128, 127); number of values: 256 (~ 2^8) */
        byte minByte = -128;
        byte maxByte = 127;
        System.out.println("Minimal byte value: " + minByte);
        System.out.println("Maximum byte value: " + maxByte);

        /* stored in memory as: 2 bytes = 16 bits; number range (-2^15, 2^15) ~ (-32 768, 32 767),
        number of values: 65 536 (~ 2^16) */
        short minShort = -32768;
        short maxShort = 32767;
        System.out.println("Minimal short " + minShort);
        System.out.println("Maximum short " + maxShort);

        /* stored in memory as: 32 bits = 4 bytes; number range (-2 147 483 648, 2 147 483 647) */
        int minInt = Integer.MIN_VALUE;
        int maxInt = Integer.MAX_VALUE;
        System.out.println("Minimal integer: " + minInt);
        System.out.println("Maximum integer: " + maxInt);

        /* (-2^63, 2^63-1) */
        long longMax = Long.MAX_VALUE;
        long someLong = 1541654156L;
        /* It is recommended that you use the upper case letter L
        because the lower case letter l is hard to distinguish from the digit 1.
         */
        System.out.println("Long minimum: " + longMax);
        System.out.println("Long example: " + someLong);

        /* (1.40239846 x 10^-45, 3.40282347 x 10^38) */
        float x = -27.554545454545545f;
        System.out.println(x);
    }
}
