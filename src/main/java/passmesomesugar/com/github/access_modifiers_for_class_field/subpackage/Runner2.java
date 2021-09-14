package passmesomesugar.com.github.access_modifiers_for_class_field.subpackage;

import passmesomesugar.com.github.access_modifiers_for_class_field.DefaultModifier;

public class Runner2 {
    public static void main(String[] args) {
        DefaultModifier defaultModifier = new DefaultModifier();
        //System.out.println(defaultModifier.defaultModifierInteger); will not work
        ProtectedModifierChild protectedModifierChild = new ProtectedModifierChild();
        protectedModifierChild.showParentProtectedInteger();
    }
}
