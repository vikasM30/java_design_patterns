package Strategy.Eg1.BehaviorType.Fly;
import Strategy.Eg1.Interface.IFlyBehavior;

public class FlyWithWings implements IFlyBehavior {

    @Override
    public void fly() {
        System.out.println("I am flying.");
    }
    
}
