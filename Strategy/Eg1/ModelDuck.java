package Strategy.Eg1;

import Strategy.Eg1.BehaviorType.Fly.FlyNoWay;
import Strategy.Eg1.BehaviorType.Quack.Quack;

public class ModelDuck extends Duck {
    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I am a Model Duck.");
    }
}
