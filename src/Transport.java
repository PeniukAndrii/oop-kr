public class Transport {
    private String model;
    private int power;
    private int price;

    public Transport() {
    }

    public Transport(String model, int power, int price) {
        this.model = model;
        this.power = power;
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void ride(){
        System.out.println("Поїхали");
    }

    @Override
    public String toString() {
        return "model='" + model + '\'' + ", power=" + power + ", price=" + price + " ";
    }
}
