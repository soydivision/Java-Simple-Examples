package github.com.passmesomesugar.OOP.polymorphism;

public class ChildClass extends ParentClass {
    public ChildClass() {
        super();
    }

    public ChildClass(int parentClassInteger, String parentClassString) {
        super(parentClassInteger, parentClassString);
    }

    @Override
    public int someParentMethodMultiply(int inputValue) {
        System.out.println("Child has overridden Parent class someParentMethodMultiply to: multiply by 3");
        int returnValue = inputValue * 3;
        System.out.println(returnValue);
        return returnValue;
    }
}
