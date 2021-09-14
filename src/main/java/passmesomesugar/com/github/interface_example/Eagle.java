package passmesomesugar.com.github.interface_example;

public class Eagle implements Behaviour, FlyingAnimal {
  @Override
  public void eat() {
    System.out.println("Nom nom eat meat");
  }

  @Override
  public void eat(String s) {}

  @Override
  public void sleep() {
    System.out.println("ZZ-z-z-z-z-z-z");
  }

  @Override
  public void fly() {}
}
