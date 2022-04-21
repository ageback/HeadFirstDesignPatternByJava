package duck;

import behaviors.impl.FlyWithWings;
import behaviors.impl.Quack;
import duck.base.Duck;

public class MallardDuck extends Duck {

    public MallardDuck() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("我是一只真正的绿头鸭");
    }
}
