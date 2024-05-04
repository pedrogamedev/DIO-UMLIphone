package phone;

public abstract class Iphone {
    String id;
    int simNumber;
    int freeRam;
    int freeFlashMemory;
    double batteryLevel;
    double volume;

    public String getId() {
        return id;
    }

    public int getSimNumber() {
        return simNumber;
    }

    public void setSimNumber(int simNumber) {
        this.simNumber = simNumber;
    }

    public int getFreeRam() {
        return freeRam;
    }

    public int getFreeFlashMemory() {
        return freeFlashMemory;
    }

    public double getBatteryLevel() {
        return batteryLevel;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }
}
