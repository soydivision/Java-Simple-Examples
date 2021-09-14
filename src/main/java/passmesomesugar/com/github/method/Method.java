package passmesomesugar.com.github.method;

public class Method {
    public static void main(String[] args) {
        int someInt = 10;
        //
        MethodExample.someStaticMethodAddsTwenty(someInt);
        //
        MethodExample me = new MethodExample();
        me.someNonStaticMethodAddsOne(someInt);
    }
}
