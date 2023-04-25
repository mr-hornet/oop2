public class Truck extends Vehicle implements CheckingTrailer, CheckingEngine, UpdatingTyre {


    public Truck(String modelName, int wheelsCount) {
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

    @Override
    public void checkTrailer() {
        System.out.println("Проверяем прицеп " + getModelName());
    }
}
