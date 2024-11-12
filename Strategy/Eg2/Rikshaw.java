package Strategy.Eg2;

import Strategy.Eg2.BehaviorType.Fuel.NoFuel;
import Strategy.Eg2.BehaviorType.Motor.NoMotor;

public class Rikshaw extends ThreeWheeler {
    public Rikshaw() {
        motor = new NoMotor();
        fuel = new NoFuel();
    }

    @Override
    public void vehicleName() {
        System.out.println("Normal Rikshaw.");
    }
}
