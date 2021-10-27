package github.com.passmesomesugar.OOP.polymorphism;

public class Runner {
    public static void main(String[] args) {
        ParentClass parentClass = new ParentClass();
        ChildClass childClass = new ChildClass();
        parentClass.someParentMethodAddOne(1);
        parentClass.someParentMethodMultiply(2);
        childClass.someParentMethodAddOne(10);
        childClass.someParentMethodMultiply(2);
        /**/
        ParentClass anotherParent = new ParentClass(85, "Mangoose");
        ChildClass anotherChild = new ChildClass(154, "Mangooose son");
        System.out.println(anotherChild.getParentClassInteger());

    }
}
