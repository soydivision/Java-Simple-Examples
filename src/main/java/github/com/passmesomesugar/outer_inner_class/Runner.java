package github.com.passmesomesugar.outer_inner_class;

public class Runner {
    public static void main(String[] args) {
        OuterClass outerClass = new OuterClass();
        outerClass.heyThere();


        /*InnerClass is non-static so in order to create new InnerClass one has to follow this weird syntax*/
        OuterClass.InnerClass innerClass = outerClass.new InnerClass();
        innerClass.heyFromInnerClass();

        /*StaticInnerClass is static indeed, so we don't need an instance of outerClass to create one*/
        OuterClass.StaticInnerClass staticInnerClass = new OuterClass.StaticInnerClass();
        staticInnerClass.heyStatic();

    }
}
