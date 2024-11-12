package Strategy.Eg2.BehaviorType.Fuel;

import Strategy.Eg2.Interface.IFuel;

public class Cng implements IFuel {

    @Override
    public void fuel() {
        System.out.println("I use CNG.");
    }
    
}
