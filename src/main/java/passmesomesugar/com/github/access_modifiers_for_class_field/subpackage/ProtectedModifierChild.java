package passmesomesugar.com.github.access_modifiers_for_class_field.subpackage;

import passmesomesugar.com.github.access_modifiers_for_class_field.ProtectedModifier;

public class ProtectedModifierChild extends ProtectedModifier {
    protected int ProtectedModifierChildInteger = 6565;

    public void showParentProtectedInteger() {
        System.out.println("Showing protected integer of parent: " + protectedInteger);
        protectedInteger++;
        System.out.println("Incrementing protected integer of parent: " + protectedInteger);
    }
}
