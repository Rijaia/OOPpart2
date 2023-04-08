public class Truck extends Transport{
    public void checkEngine() {
        System.out.println("Проверяем двигатель");
    }

    public void checkTrailer() {
        System.out.println("Проверяем прицеп");
    }

    public Truck(String modelName, int wheelsCount) {
       super(modelName, wheelsCount);
    }


}
