package passmesomesugar.com.github.abstract_class;

public class AnimalRunner {
  public static void main(String args[]) {
    Dog dogger = new Dog("Doggy duck");
    dogger.sound();
    System.out.println(dogger.getAnimalName());
    System.out.println(dogger.callAnimalName());
    Lion kang = new Lion("Lion");
    kang.sound();
    System.out.println(kang.getAnimalName());
    System.out.println(kang.callAnimalName());
  }
}
