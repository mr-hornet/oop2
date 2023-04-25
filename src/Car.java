public class Car extends Vehicle implements CheckingEngine, UpdatingTyre {

    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void updateTyre() {
        System.out.println("Меняем покрышку " + getModelName());
    }

    @Override
    public void checkEngine() {
        System.out.println("Проверяем двигатель " + getModelName());
    }
}
