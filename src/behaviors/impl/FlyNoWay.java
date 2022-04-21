package behaviors.impl;

import behaviors.FlyBehavior;

public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("我不能飞……");
    }
}
