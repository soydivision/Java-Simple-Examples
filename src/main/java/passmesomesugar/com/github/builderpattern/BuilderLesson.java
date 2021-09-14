package passmesomesugar.com.github.builderpattern;

public class BuilderLesson {
    public static void main(String[] args) {
        SportCar ferrari = new SportCar.Builder("F330").setColor("red").setMaxSpeed(280).build();
        System.out.println(ferrari.getName());
        System.out.println(ferrari);
    }
}

class SportCar {
    private String name;
    private String color;
    private int maxSpeed;

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    private SportCar(Builder builder) {
        this.name = builder.name;
        this.color = builder.color;
        this.maxSpeed = builder.maxSpeed;
    }

    static class Builder {
        private String name;
        private String color;
        private int maxSpeed;

        public Builder(String name) {
            this.name = name;
        }

        public Builder setColor(String color) {
            this.color = color;
            return this;
        }

        public Builder setMaxSpeed(int maxSpeed) {
            this.maxSpeed = maxSpeed;
            return this;
        }

        public SportCar build() {
            return new SportCar(this);
        }
    }
}
