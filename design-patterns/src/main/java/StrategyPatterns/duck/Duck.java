package StrategyPatterns.duck;

import StrategyPatterns.fly.FlyBehavior;
import StrategyPatterns.quack.QuackBehavior;

public abstract class Duck {
    protected FlyBehavior flyBehavior;

    protected QuackBehavior quackBehavior;

    public abstract void display();

    public void performFly(){
        flyBehavior.fly();
    }

    public void performQuack(){
        quackBehavior.quack();
    }

    public void setFlyBehavior(FlyBehavior flyBehavior){
        this.flyBehavior = flyBehavior;
    }
    public void setQuackBehavior(QuackBehavior quackBehavior){
        this.quackBehavior = quackBehavior;
    }
}
