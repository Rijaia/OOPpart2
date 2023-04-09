public class ServiceStation implements Service {



    public void printCheck (Transport transport){
            System.out.println("Обслуживаем " + transport.getModelName());
            for (int i = 0; i < transport.getWheelsCount(); i++) {
                transport.updateTyre();
        }
    }


     public void printCheck(Car car) {
         System.out.println("Обслуживаем " + car.getModelName());
         for (int i = 0; i < car.getWheelsCount(); i++) {
             car.updateTyre();
         }
        car.checkEngine();

    }
    public void printCheck(Truck truck) {
        System.out.println("Обслуживаем " + truck.getModelName());
        for (int i = 0; i < truck.getWheelsCount(); i++) {
            truck.updateTyre();
        }
        truck.checkEngine();
        truck.checkTrailer();

    }


}