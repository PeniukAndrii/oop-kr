import java.util.ArrayList;
import java.util.List;

public class LandTransport extends Transport{
    private String kind;
    private String fuelType;
    private String wheelDrive;

    public LandTransport() {
    }

    public LandTransport(String model, int power, int price, String kind, String fuelType, String wheelDrive) {
        super(model, power, price);
        this.kind = kind;
        this.fuelType = fuelType;
        this.wheelDrive = wheelDrive;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public String getWheelDrive() {
        return wheelDrive;
    }

    public void setWheelDrive(String wheelDrive) {
        this.wheelDrive = wheelDrive;
    }

    @Override
    public void ride() {
        System.out.println("This is " + super.toString() + "kind:" + kind);
    }

    public void getAll(List<Transport> list) {
        list.forEach(transport -> System.out.println(transport.getModel() + " " + transport.getPrice() + " " + transport.getPower()));
    }

    @Override
    public String toString() {
        return "LandTransport{" +
                "kind='" + kind + '\'' +
                ", fuelType='" + fuelType + '\'' +
                ", wheelDrive='" + wheelDrive + '\'' +
                "} " + super.toString();
    }
}
