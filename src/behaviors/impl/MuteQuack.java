package behaviors.impl;

import behaviors.QuackBehavior;

public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("<< 安静了 >>");
    }
}
