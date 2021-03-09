public class WatherTransport extends Transport{
    private int seating;
    private String name;
    private boolean sail;

    public WatherTransport() {
    }

    public WatherTransport(String model, int power, int price, int seating, String name, boolean sail) {
        super(model, power, price);
        this.seating = seating;
        this.name = name;
        this.sail = sail;
    }

    public int getSeating() {
        return seating;
    }

    public void setSeating(int seating) {
        this.seating = seating;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isSail() {
        return sail;
    }

    public void setSail(boolean sail) {
        this.sail = sail;
    }

    @Override
    public void ride() {
        System.out.println("this is " + name + " " + super.toString());
    }

    @Override
    public String toString() {
        return "WatherTransport{" +
                "seating=" + seating +
                ", name='" + name + '\'' +
                ", sail=" + sail +
                "} " + super.toString();
    }
}
