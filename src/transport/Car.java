package transport;

public class Car extends EngineTransport{
    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void check() {
        System.out.println("начинаем обслуживание автомобиля " + getModelName());
        super.check();
    }
}
