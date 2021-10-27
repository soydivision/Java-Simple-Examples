package github.com.passmesomesugar.conditional_statements;

import java.util.Random;

public class Switch {
    public static void main(String[] args) {
        Random random = new Random();
        System.out.println("- How many cars do you own?");
        int cars = random.nextInt(5);
        System.out.println("- I have " + cars + " cars.");
        switch (cars) {
            case 0:
                System.out.println("- Oh. I hope you have metro in your city");
                break;
            case 1:
                System.out.println("- It is great to have one car");
                break;
            case 2:
                System.out.println("- Having two cars is must be great");
                break;
            case 3:
                System.out.println("- Wow great to have 3 cars.");
                break;
            case 4:
                System.out.println("- 4 cars. What do you do for a living?");
                break;
            case 5:
                System.out.println("- 5 car$? You a rich man!");
                break;
        }
    }
}
