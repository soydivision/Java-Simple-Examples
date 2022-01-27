package github.com.passmesomesugar.outer_inner_class;

public class OuterClass {
    int outerNumber = 5;

    void heyThere() {
        System.out.println("Hey there");
    }


    public class InnerClass {
        int innerNumber = 18;

        void heyFromInnerClass() {
            System.out.println("Her there from inner class");
        }
    }

    public static class StaticInnerClass {
        void heyStatic() {
            System.out.println("Hey from static inner class");
        }
    }
}
