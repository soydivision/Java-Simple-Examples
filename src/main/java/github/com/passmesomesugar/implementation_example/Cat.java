package github.com.passmesomesugar.implementation_example;

public class Cat {
  String name;
  int age;

  public Cat(String name, int age) {
    this.name = name;
    this.age = age;
  }

  @Override
  public String toString() {
    return ("My name is " + name + " and my age is " + age);
  }
}
