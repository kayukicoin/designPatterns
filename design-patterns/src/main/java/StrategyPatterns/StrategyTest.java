package StrategyPatterns;

import StrategyPatterns.duck.Duck;
import StrategyPatterns.duck.MallardDuck;
import StrategyPatterns.duck.ModelDuck;

public class StrategyTest {
    public static void main(String[] args) {
        Duck duck = new MallardDuck();
        duck.display();
        duck.performFly();
        duck.performQuack();

        Duck duck1 = new ModelDuck();
        duck1.display();
        duck1.performFly();
        duck1.performQuack();
    }

}
