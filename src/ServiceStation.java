public class ServiceStation implements Service {



    public void printCheck (Transport transport){
            System.out.println("Обслуживаем " + transport.getModelName());
            for (int i = 0; i < transport.wheelsCount; i++) {
                transport.updateTyre();
        }
    }

    public void check(Transport transport) {

    }
     public void printCheck(Car car) {
         System.out.println("Обслуживаем " + car.getModelName());
         for (int i = 0; i < car.wheelsCount; i++) {
             car.updateTyre();
         }
        car.checkEngine();

    }
    public void printCheck(Truck truck) {
        System.out.println("Обслуживаем " + truck.getModelName());
        for (int i = 0; i < truck.wheelsCount; i++) {
            truck.updateTyre();
        }
        truck.checkEngine();
        truck.checkTrailer();

    }


}