package Strategy.Eg2.BehaviorType.Fuel;

import Strategy.Eg2.Interface.IFuel;

public class Petrol implements IFuel {

    @Override
    public void fuel() {
        System.out.println("I use Petrol.");
    }
    
}
