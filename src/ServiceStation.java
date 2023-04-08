public class ServiceStation implements Service {



    public void printCheck (Transport transport){
            System.out.println("Обслуживаем " + transport.getModelName());
            for (int i = 0; i < transport.wheelsCount; i++) {
                transport.updateTyre();
        }
    }


    @Override
    public void check(Transport transport) {

    }
}