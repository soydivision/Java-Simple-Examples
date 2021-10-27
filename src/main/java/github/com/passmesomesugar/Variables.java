package github.com.passmesomesugar;

class Variables {
    static int number = 10; //static variable
    private int data;

    public Variables() {
        this.data = 30;// instance variable
        int data1 = 40;
        System.out.println(data1);
        data1 +=20;
        System.out.println(data1);
    }

    public int getData() {
        return data;
    }

    public static void main(String[] args) {
        Variables variables = new Variables();
        System.out.println(variables.getData());
    }

    void someMethod() {
        int num = 30; //local variable
    }
}
