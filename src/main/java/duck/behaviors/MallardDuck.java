package duck.behaviors;

class MallardDuck extends Duck {
    MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    String display() {
        return "I'm a real Mallard duck";
    }
}
