package passmesomesugar.com.github.interface_example;

public interface Behaviour {
  default void salute() {
    System.out.println("Animal salutes you from default animal method!");
  }

  void eat();

  void eat(String s);

  void sleep();
}
