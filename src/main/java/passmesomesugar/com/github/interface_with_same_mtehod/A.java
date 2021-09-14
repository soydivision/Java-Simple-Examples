package passmesomesugar.com.github.interface_with_same_mtehod;

public interface A {
  default void someMethodTest() {
    System.out.println("Method of A interface");
  }
}
