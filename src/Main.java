import service.ServiceStation;
import transport.Bicycle;
import transport.Car;
import transport.Truck;

public class Main {
    public static void main(String[] args) {
        Bicycle bicycle = new Bicycle("Орлёнок", 2);
        Car car = new Car("Москвич", 4);
        Truck truck = new Truck("Камаз", 6);

        ServiceStation serviceStation = new ServiceStation();
        serviceStation.check(bicycle);
        serviceStation.check(car);
        serviceStation.check(truck);
    }
}