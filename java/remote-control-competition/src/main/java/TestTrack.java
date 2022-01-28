import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

public class TestTrack {

    public static void race(RemoteControlCar car) {
        car.drive();
    }

    public static List<ProductionRemoteControlCar> getRankedCars(ProductionRemoteControlCar prc1, ProductionRemoteControlCar prc2) {
        List<ProductionRemoteControlCar> list = new ArrayList<>();
        list.add(prc1);
        list.add(prc2);
        Collections.sort(list);
        return list;
    }
}
