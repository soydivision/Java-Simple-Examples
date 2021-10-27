package github.com.passmesomesugar.abstract_class;

public class Dog extends AbstractAnimal {
  public Dog(String name) {
    super(name);
  }

  @Override
  public void sound() {
    System.out.println("Wuff");
  }

  @Override
  public void sleep() {}

  @Override
  public void eat() {}
}
