package github.com.passmesomesugar.abstract_class;

public abstract class AbstractAnimal {
    private String name;
    private int weight;
    private static int SHIPPING_PRICE = 22;
    public static int animalCount; // .this can have static fields

    // The class which is extending abstract class must override all the abstract methods.
    public abstract void sound(); // abstract method

    public abstract void sleep();

    public abstract void eat();

    public static int quantity() {
        return animalCount;
    }

    public int countTransportation() {
        return weight * SHIPPING_PRICE;
    }

    String getAnimalName() {
        return name;
    }

    String callAnimalName() { // non-abstract method
        return "Hey, " + name + "!";
    }

    public AbstractAnimal(String name) {
        this.name = name;
    }
}
