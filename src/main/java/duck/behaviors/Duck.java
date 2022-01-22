package duck.behaviors;

abstract class Duck {
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    Duck() {}

    abstract String display();

    String performQuack() {
        return quackBehavior.quack();
    }

    String performFly() {
        return flyBehavior.fly();
    }

    String swim() {
        return "All ducks float, even decoys!";
    }

    void setFlyBehavior(FlyBehavior fb) {
        flyBehavior = fb;
    }

    void setQuackBehavior(QuackBehavior qb) {
        quackBehavior = qb;
    }
}
