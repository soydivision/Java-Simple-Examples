package github.com.passmesomesugar.annotations.simple_example_with_override_annotation;

public class Runner {


    public static void main(String[] args) {
        PrimeExampleParentClass primeExample = new PrimeExampleParentClass();
        primeExample.show();

        DerivedPrimeExample derivedPrimeExample = new DerivedPrimeExample();
        derivedPrimeExample.show(28);

        derivedPrimeExample.showWithOverloaded(); // child has access to parent method

        derivedPrimeExample.show();
        derivedPrimeExample.someMethodUsingParentShow();

    }
}
