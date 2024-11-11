package Strategy.Eg1;
import Strategy.Eg1.Interface.IFlyBehavior;
import Strategy.Eg1.Interface.IQuackBehavior;

public abstract class Duck {
    IFlyBehavior flyBehavior;
    IQuackBehavior quackBehavior;

    public abstract void display();

    public void performFly() {
        flyBehavior.fly();
    }

    public void performQuack() {
        quackBehavior.quack();
    }

    public void setFlyBehavior (IFlyBehavior fb) {
        flyBehavior = fb;
    }

    public void setQuackBehavior (IQuackBehavior qb) {
        quackBehavior = qb;
    }

    public void swim(){
        System.out.println("All ducks float, even decoys");
    }
}
