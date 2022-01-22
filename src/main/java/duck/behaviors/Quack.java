package duck.behaviors;

public class Quack implements QuackBehavior {
    @Override
    public String quack() {
        return "Quack";
    }
}
