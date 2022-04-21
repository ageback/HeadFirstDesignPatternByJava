package duck.base;

import behaviors.FlyBehavior;
import behaviors.QuackBehavior;

public abstract class Duck {
    public FlyBehavior flyBehavior;
    public QuackBehavior quackBehavior;

    public Duck() {
    }

    public abstract void display();

    public void performFly() {
        flyBehavior.fly();
    }

    public void performQuack() {
        quackBehavior.quack();
    }

    public void swim() {
        System.out.println("所有鸭子都能浮起来，即使是诱饵鸭！");
    }
}
