package Strategy.Eg1.BehaviorType.Quack;
import Strategy.Eg1.Interface.IQuackBehavior;

public class MuteQuack implements IQuackBehavior {
    @Override
    public void quack() {
        // TODO Auto-generated method stub
        System.out.println("Mute quack");
    }
}
