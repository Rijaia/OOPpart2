public abstract class Transport {
    protected String modelName;
    protected int wheelsCount;

    public String getModelName() {
        return modelName;
    }



    public Transport(String modelName, int wheelsCount) {
        this.modelName = modelName;
        this.wheelsCount = wheelsCount;

    }

    public void updateTyre() {

            System.out.println("Меняем покрышку");  }


}
