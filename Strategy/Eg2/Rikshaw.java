package Strategy.Eg2;

import Strategy.Eg2.BehaviorType.Fuel.Electric;
import Strategy.Eg2.BehaviorType.Fuel.NoFuel;
import Strategy.Eg2.BehaviorType.Motor.HaveMotor;
import Strategy.Eg2.BehaviorType.Motor.NoMotor;

public class Rikshaw extends ThreeWheeler {
    public Rikshaw() {
        motor = new NoMotor();
        fuel = new NoFuel();
    }

    @Override
    public void vehicleName() {
        // TODO Auto-generated method stub
        System.out.println("Normal Rikshaw.");
    }
}
