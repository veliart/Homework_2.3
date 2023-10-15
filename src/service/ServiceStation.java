package service;

import transport.Bicycle;
import transport.Car;
import transport.Truck;

public class ServiceStation {
    public void check(Serviceable serviceable) {
        serviceable.check();
    }
}