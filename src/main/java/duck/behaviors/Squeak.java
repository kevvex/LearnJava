package duck.behaviors;

public class Squeak implements QuackBehavior {
    @Override
    public String quack() {
        return "Squeak";
    }
}
