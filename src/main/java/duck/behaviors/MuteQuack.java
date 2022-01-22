package duck.behaviors;

public class MuteQuack implements QuackBehavior {
    @Override
    public String quack() {
        return "<< Silence >>";
    }
}
