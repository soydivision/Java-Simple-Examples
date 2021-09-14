package passmesomesugar.com.github.abstract_class;

public class Lion extends AbstractAnimal {
  public Lion(String name) {
    super(name);
  }

  @Override
  public void sound() {
    System.out.println("Roar");
  }

  @Override
  public void sleep() {}

  @Override
  public void eat() {}
}
