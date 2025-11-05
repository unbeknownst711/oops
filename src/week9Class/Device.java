package week9Class;

public class Device {
    String brand;
    String model;
    interface Connectivity{
        void connectToWiFi(String networkName);
        void disconnectFromWiFi();
    }

    public Device(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public void displayInfo(){
        System.out.printf("Device info, %s : %s\n", brand,model);
    }
}
