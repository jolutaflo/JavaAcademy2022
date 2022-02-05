package first;

public class MusicPlayerBuilder {
    private String color = "";
    private int storage = 0;
    private int battery = 0;

    public MusicPlayerBuilder() {}

    public MusicPlayerBuilder setColor(String color){
        this.color = color;
        return this;
    }

    public MusicPlayerBuilder setStorage(int storage){
        this.storage = storage;
        return this;
    }

    public MusicPlayerBuilder setBattery(int battery){
        this.battery = battery;
        return this;
    }

    public MusicPlayer build(){
        return new MusicPlayer(color, storage, battery);
    }
}
