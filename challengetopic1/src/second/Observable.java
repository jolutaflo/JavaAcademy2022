package second;

public interface Observable {
     void attach(Observer o);
     void detach(Observer o);
     void notifyUpdate();
}
