package passmesomesugar.com.github.interface_with_same_mtehod;

public interface B {
  default void someMethodTest() {
    System.out.println("Method of B interface");
  }
}
