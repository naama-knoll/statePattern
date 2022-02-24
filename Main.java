import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {

        var directionService=new DirectionService();

        directionService.setTravelMode(new Driving());
        directionService.getEta();
        directionService.getDirection();

        directionService.setTravelMode(new Bicycling());
        directionService.getEta();
        directionService.getDirection();
    }
}
