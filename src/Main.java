import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        LandTransport landTransport = new LandTransport("AUDI",300, 2000,"sedan","diesel","4wd");
        WatherTransport watherTransport = new WatherTransport("Gelex-390", 40, 3000,3,"Blue-Laguna",false);
        watherTransport.ride();
        landTransport.ride();

        List<Transport> arrayList = new ArrayList<>();
        arrayList.add(new LandTransport("AUDI",300, 2000,"sedan","diesel","4wd"));
        arrayList.add(new WatherTransport("Gelex-390", 40, 3000,3,"Blue-Laguna",false));

        landTransport.getAll(arrayList);
    }
}
