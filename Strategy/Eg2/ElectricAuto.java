package Strategy.Eg2;

import Strategy.Eg2.BehaviorType.Fuel.Electric;
import Strategy.Eg2.BehaviorType.Motor.HaveMotor;

public class ElectricAuto extends ThreeWheeler {
    public ElectricAuto() {
        motor = new HaveMotor();
        fuel = new Electric();
    }

    @Override
    public void vehicleName() {
        System.out.println("Electric Auto.");
    }
}
