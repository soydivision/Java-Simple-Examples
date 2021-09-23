package passmesomesugar.com.github.generics;

public class CustomArrayList {
    private Object[] data;
    private int count;

    public CustomArrayList() {
        this.data = new Object[10];
        this.count = 0;
    }

    public void add(Object o) {
        this.data[count] = o;
        count++;
    }

    public Object[] getData() {
        return data;
    }
}
