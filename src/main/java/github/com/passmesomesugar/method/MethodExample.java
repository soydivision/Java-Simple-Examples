package github.com.passmesomesugar.method;

public class MethodExample {
    public int someNonStaticMethodAddsOne(int someParameter) {
        someParameter = someParameter + 1;
        System.out.println("Non Static method called, need an instance of class");
        System.out.println(someParameter);
        return someParameter;
    }

    public static int someStaticMethodAddsTwenty(int someParameter) {
        someParameter = someParameter + 20;
        System.out.println("Static method called, need no instance of class containing method");
        System.out.println(someParameter);
        return someParameter;
    }
}
