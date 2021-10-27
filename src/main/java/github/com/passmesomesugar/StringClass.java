package github.com.passmesomesugar;

public class StringClass {
    public static void main(String[] args) {
        String someString = "Some random string";
        System.out.println(someString);
        //
        String lowerCaseString = someString.toLowerCase();
        System.out.println("case lowered:" + lowerCaseString);
        //
        String upperCaseString = someString.toUpperCase();
        System.out.println("case upped:" + upperCaseString);
        //
        System.out.println("Comparing ignoring the case: " + lowerCaseString.equalsIgnoreCase(upperCaseString));
        //
        System.out.println(someString.replace("m", "s"));
        System.out.println(someString);
    }
}
