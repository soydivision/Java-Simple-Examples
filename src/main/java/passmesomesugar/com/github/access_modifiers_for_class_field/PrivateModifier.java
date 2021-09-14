package passmesomesugar.com.github.access_modifiers_for_class_field;

public class PrivateModifier {
    private int privateInteger = 50;

    public void printPrivateInteger() {
        privateInteger = 800;
        System.out.println(privateInteger);
    }
}
