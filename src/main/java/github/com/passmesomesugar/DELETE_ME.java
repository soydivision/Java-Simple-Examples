package github.com.passmesomesugar;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DELETE_ME {
    public static void main(String[] args) throws ParseException {


    }


    public int numberParser(int number, int[] numbers) {
        String str = String.valueOf(number);
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char code = str.charAt(i);
            int n = Character.digit(code, 10);
            numbers[i] = n;
        }
        return length;
    }


}
