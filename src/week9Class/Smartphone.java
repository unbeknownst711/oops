package week9Class;

public class Smartphone implements Power, VolumeControl, Device.Connectivity{
    int currentVolume = 0;
    String connectedNetwork;
    private Device d;

    public Smartphone(String brand, String model) {
        d = new Device(brand,model);
    }
    public void connectToWiFi(String networkName) {
        System.out.println("Connect " + networkName);
        connectedNetwork = networkName;
    }
    public void disconnectFromWiFi() {
        if(connectedNetwork == null) return;
        System.out.println("Disconnect " + connectedNetwork);
        connectedNetwork = null;
    }
    public void turnOn() {
        System.out.println("Device On");
    }
    public void turnOff() {
        System.out.println("Device Off");
    }
    public void increaseVolume(int level) {
        currentVolume = Integer.min(100, currentVolume+level);
        System.out.println("Volume increase to " + currentVolume);
    }
    public void decreaseVolume(int level) {
        currentVolume = Integer.max(0, currentVolume+level);
        System.out.println("Volume decrease to " + currentVolume);

    }
    public void childDisplayInfo(){
        d.displayInfo();
    }
}
