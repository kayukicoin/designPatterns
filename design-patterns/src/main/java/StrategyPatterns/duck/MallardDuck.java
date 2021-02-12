package StrategyPatterns.duck;

import StrategyPatterns.fly.FlyWithWings;
import StrategyPatterns.quack.QuackWithGaGa;

public class MallardDuck extends Duck {
    public MallardDuck(){
        flyBehavior = new FlyWithWings();
        quackBehavior = new QuackWithGaGa();
    }
    public void display() {
        System.out.println("I am a mallardDuck");
    }
}
