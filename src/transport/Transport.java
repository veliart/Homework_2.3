package transport;

import service.Serviceable;

public abstract class Transport implements Serviceable {
    private String modelName; // выносим в класс родителя
    private int wheelsCount; // выносим в класс родителя

    public Transport(String modelName, int wheelsCount) {
        this.modelName = modelName;
        this.wheelsCount = wheelsCount;
    }

    public String getModelName() {
        return modelName;
    }

    public int getWheelsCount() {
        return wheelsCount;
    }

    public void updateTyre() {
        System.out.println("Меняем покрышку");
    }

    @Override
    public void check() {
        for (int i = 0; i < wheelsCount; i++) {
            updateTyre();
        }
    }
}
