package passmesomesugar.com.github.generics;

import java.util.Arrays;
import java.util.List;

public class GenericsExample {

    public static void printAll(List<?> list) {
        for (Object item : list)
            System.out.println(item + " ");
    }


    public static void main(String args[]) {
        List<Integer> iL = Arrays.asList(1, 2, 3);
        printAll(iL);

        List<Double> dL = Arrays.asList(1.2, 2.3, 3.5);
        printAll(dL);
    }
}
