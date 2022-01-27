package github.com.passmesomesugar.anonymous_inner_class;

public class Runner {

    public static void main(String[] args) {

        Animal animal = new Animal();
        animal.makeNoise();

        Animal bigFoot = new Animal() {
            @Override
            void makeNoise() {
                System.out.println("Ayeeaaaaaaaaaaaah");
            }
        };
        bigFoot.makeNoise();
    }
}
