import week9Class.Smartphone;

import java.util.Scanner;

public class Week9 {
    public Week9() {
        Smartphone test = new Smartphone("Banana" , "B099");
        test.childDisplayInfo();
        test.turnOn();
        test.connectToWiFi("wemen");
        test.increaseVolume(50);
        test.decreaseVolume(10);
        test.disconnectFromWiFi();
        test.turnOff();
    }
}
