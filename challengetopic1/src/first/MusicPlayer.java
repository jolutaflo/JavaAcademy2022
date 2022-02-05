package first;

public class MusicPlayer {
    private String color;
    private int storage;
    private int battery;

    public MusicPlayer(String color, int storage, int battery) {
        this.color = color;
        this.storage = storage;
        this.battery = battery;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getStorage() {
        return storage;
    }

    public void setStorage(int storage) {
        this.storage = storage;
    }

    public int getBattery() {
        return battery;
    }

    public void setBattery(int battery) {
        this.battery = battery;
    }

    @Override
    public String toString() {
        return "MusicPlayer{" +
                "color='" + color + '\'' +
                ", storage=" + storage +
                ", battery=" + battery +
                '}';
    }
}
