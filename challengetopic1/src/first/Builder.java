package first;

import java.util.Scanner;

public class Builder {
    public static void main(String[] args) {

        String color;
        int storage;
        int battery;

        Scanner gui = new Scanner(System.in);

        System.out.println("Color: 'Blue' or 'Green'\nEnter your selection");
        color = gui.nextLine();
        System.out.println("Storage (Gbs): '8' or '16'\nEnter your selection");
        storage = Integer.parseInt(gui.nextLine());
        System.out.println("Battery (Hours): '5' or '8'\nEnter your selection");
        battery = Integer.parseInt(gui.nextLine());


        MusicPlayer mp = new MusicPlayerBuilder()
                .setColor(color)
                .setStorage(storage)
                .setBattery(battery)
                .build();
        System.out.println(mp);
    }
}
