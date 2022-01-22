package duck.behaviors;

public class ModelDuck extends Duck {
    ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    String display() {
        return "I'm a model duck";
    }
}
