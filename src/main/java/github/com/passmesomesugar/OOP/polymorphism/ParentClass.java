package github.com.passmesomesugar.OOP.polymorphism;

public class ParentClass {
    int parentClassInteger;
    String parentClassString;

    public int getParentClassInteger() {
        return parentClassInteger;
    }

    public String getParentClassString() {
        return parentClassString;
    }

    public ParentClass() {
    }

    public ParentClass(int parentClassInteger, String parentClassString) {
        this.parentClassInteger = parentClassInteger;
        this.parentClassString = parentClassString;
    }

    public int someParentMethodAddOne(int inputValue) {
        System.out.println("Some parent method, returns input value +1");
        int returnValue = inputValue + 1;
        System.out.println(returnValue);
        return returnValue;
    }

    public int someParentMethodMultiply(int inputValue) {
        System.out.println("Multiply parent method, returns input value * 2");
        int returnValue = inputValue * 2;
        System.out.println(returnValue);
        return returnValue;
    }
}
