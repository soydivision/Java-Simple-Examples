package github.com.passmesomesugar.constructors;

public class Runner {
    public static void main(String[] args) {
        Cat kote = new Cat();
        kote.setName("MURKOOO");
        System.out.println(kote.getName());
        Cat newkote = new Cat("dksjfkljsd");
        System.out.println(newkote.toString());
    }
}
