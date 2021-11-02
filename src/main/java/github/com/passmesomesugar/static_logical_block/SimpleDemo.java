package github.com.passmesomesugar.static_logical_block;

public class SimpleDemo {
    public static void main(String[] args) {
        {
            System.out.println();
            System.out.println("Im logical block. Establish connection here for example. With database or internet");
        }
    }

    static {
        System.out.println();
        System.out.println("I'm static block. I'll be first to execute ~ once, despite being further down in code, or when someone" +
                "tries to access static field. .");
    }
}
