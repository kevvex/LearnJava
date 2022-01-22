package duck.behaviors;

import org.junit.jupiter.api.Test;

class TestDuckBehaviors {
    @Test
    void testMallardDuckBehaviors() {
        Duck mallard = new MallardDuck();
        String quack = mallard.performQuack();
        String fly = mallard.performFly();
        System.out.println(quack);
        System.out.println(fly);
    }

    @Test
    void testModelDuckBehaviors() {
        Duck model = new ModelDuck();
        String fly = model.performFly();
        System.out.println(fly);
        model.setFlyBehavior(new FlyRocketPowered());
        fly = model.performFly();
        System.out.println(fly);
    }

    @Test
    void testMallardDuckQuack() {
        Duck duck = new MallardDuck();
        String quack = duck.performQuack();
        System.out.println(quack);
    }

    @Test
    void testMallardDuckDisplay() {
        MallardDuck duck = new MallardDuck();
        String say = duck.display();
        System.out.println(say);
    }
}
