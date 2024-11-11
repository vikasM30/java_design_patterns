package Strategy.Eg1.BehaviorType.Fly;
import Strategy.Eg1.Interface.IFlyBehavior;

public class FlyNoWay implements IFlyBehavior {

    @Override
    public void fly() {
        // TODO Auto-generated method stub
        System.out.println("I can't flying.");
    }
    
}
