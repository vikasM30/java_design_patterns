package Strategy.Eg2.BehaviorType.Motor;

import Strategy.Eg2.Interface.IMotor;

public class NoMotor implements IMotor{

    @Override
    public void motor() {
        // TODO Auto-generated method stub
        System.out.println("I have no motor.");
    }
}
