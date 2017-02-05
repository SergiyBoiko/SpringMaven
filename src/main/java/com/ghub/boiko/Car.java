package com.ghub.boiko;

import com.ghub.boiko.carparts.Engine;
import com.ghub.boiko.carparts.Wheel;

public class Car {

    private Wheel wheels;
    private Engine engine;

    public Car() {
    }

    public Car(Wheel wheels, Engine engine) {
        this.wheels = wheels;
        this.engine = engine;
    }

    public Wheel getWheels() {
        return wheels;
    }

    public void setWheels(Wheel wheels) {
        this.wheels = wheels;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Car{" +
                "\nwheels tyre size = " + getWheels().getTyres().getSize() +
                "\nwheels tyre name = " + getWheels().getTyres().getName() +
                "\nengine car =" + getEngine().getEngineСapacity() +
                '}';
    }
}
