package github.com.passmesomesugar.method_overload;

public class Demo {

    public static void main(String[] args) {
        someMethod();
        someMethod(554);
    }

    public static void someMethod() {
        System.out.println();
        System.out.println("Void, Nothing ");
    }

    /* We can overload static methods as well */
    public static void someMethod(int i) {
        System.out.println();
        System.out.println("Overloaded method, just prints out:");
        System.out.println(i);
    }
}
