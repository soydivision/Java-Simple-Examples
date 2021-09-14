package passmesomesugar.com.github.access_modifiers_for_class_field;

public class Runner {
    public static void main(String[] args) {
        PrivateModifier privateModifier = new PrivateModifier();
        System.out.println("Printing out private Modifier integer through print method");
        //System.out.println(privateModifier.privateInteger); will not work
        privateModifier.printPrivateInteger();
        //privateModifier.privateInteger = 1000; will not work
        DefaultModifier defaultModifier = new DefaultModifier();
        System.out.println("Before modification default access integer: " + defaultModifier.defaultModifierInteger);
        defaultModifier.defaultModifierInteger = 888;
        System.out.println("After modification default access integer: " + defaultModifier.defaultModifierInteger);
        ProtectedModifier protectedModifier = new ProtectedModifier();
        System.out.println("Acessing protected variable: " + protectedModifier.protectedInteger);
    }
}
