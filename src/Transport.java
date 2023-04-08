public abstract class Transport {
    protected String modelName;
    protected int wheelsCount;

    public String getModelName() {
        return modelName;
    }

    public int getWheelsCount() {
        return wheelsCount;
    }

    public Transport(String modelName, int wheelsCount) {
        this.modelName = modelName;
        this.wheelsCount = wheelsCount;

    }

    public void updateTyre() {
        for (int i = 0; i <= getWheelsCount(); i++) {
            System.out.println("Меняем покрышку");}

    }


}
