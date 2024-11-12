package Strategy.Eg1;

import Strategy.Eg1.BehaviorType.Fly.FlyWithWings;

/*  Strategy Pattern:- Defines a family of algorithms, encapsulates each one, and make them interchangeable.
    Strategy lets the algo vary independently from client that use it.
*/

/* OOPs Principles used:
    Encapsulate what varies.
    Favor composition over inheritance.
    Program to interface, not implementations.
*/

public class Main {
    public static void main(String[] args) {
        Duck model = new ModelDuck();
        model.display();
        model.performQuack();
        model.performFly();

        // todirectly call the behaviour type
        model.setFlyBehavior(new FlyWithWings());
        model.performFly();
    }
}
