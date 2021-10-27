package github.com.passmesomesugar.annotations.simple_example_with_override_annotation;

public class DerivedPrimeExample extends PrimeExampleParentClass {

    /*  @Override  ~ will not compile*/
    public void show(int x) {
        System.out.println("show() " + x + " from DerivedPrimeExample");
    }


    @Override
    public void show() {
        System.out.println("Overridden show() from child");
    }

    public void someMethodUsingParentShow() {
        super.show();
    }

}
