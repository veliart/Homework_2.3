package transport;

public class Truck extends EngineTransport{
    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }
    public void checkTrailer() {
        System.out.println("Проверяем прицеп");
    }

    @Override
    public void check() {
        System.out.println("Начинаем обслуживание грузового автомобиля " + getModelName());
        super.check();
        checkTrailer();
    }
}
