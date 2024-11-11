package Strategy.Eg2.BehaviorType.Fuel;

import Strategy.Eg2.Interface.IFuel;

public class NoFuel implements IFuel {

    @Override
    public void fuel() {
        // TODO Auto-generated method stub
        System.out.println("I use no fuel.");
    }
    
}
