package github.com.passmesomesugar.pathforfiles;

public class PathToCurrentProject {
    public static void main(String[] args) {
        String dir = System.getProperty("user.dir");
        System.out.println(dir);
    }
}
