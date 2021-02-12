package StrategyPatterns.duck;

import StrategyPatterns.fly.FlyNotWay;
import StrategyPatterns.quack.QuackNotWay;

public class ModelDuck extends Duck {
    public ModelDuck(){
        flyBehavior = new FlyNotWay();
        quackBehavior = new QuackNotWay();
    }
    public void display() {
        System.out.println("I am a ModelDuck");
    }
}
