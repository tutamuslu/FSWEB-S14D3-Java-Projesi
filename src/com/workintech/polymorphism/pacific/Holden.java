package com.workintech.polymorphism.pacific;

public class Holden extends Car {


    public Holden(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        super.startEngine();
        return getName() + "engine is starting";
    }

    @Override
    public String accelerate() {
        super.accelerate();
        return getName() + "is accelerating";
    }

    @Override
    public String brake() {
        super.brake();
        return getName() + "is braking";
    }
}
