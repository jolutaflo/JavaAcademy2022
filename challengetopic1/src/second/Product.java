package second;

import java.util.ArrayList;
import java.util.List;

public class Product implements Observable {
    private String name;
    private double price;

    private List<Observer> observers = new ArrayList<>();

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public void attach(Observer o) {
        observers.add(o);
    }

    @Override
    public void detach(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyUpdate() {
        for(Observer o : observers){
            o.update(this);
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
        this.notifyUpdate();
    }
}
