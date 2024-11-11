package Strategy.Eg2;

import Strategy.Eg2.Interface.IFuel;
import Strategy.Eg2.Interface.IMotor;

public abstract class ThreeWheeler {
    IMotor motor;
    IFuel fuel;

    public abstract void vehicleName();

    public void fuleType() {
        fuel.fuel();
    }

    public void isMotor() {
        motor.motor();
    }
    
}
