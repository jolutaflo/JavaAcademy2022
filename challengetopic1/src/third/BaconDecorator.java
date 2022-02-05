package third;

public class BaconDecorator extends HotDogDecorator {

    public BaconDecorator(HotDog decoratedHotDog) {
        super(decoratedHotDog);
    }

    @Override
    public void ingredients() {
        decoratedHotDog.ingredients();
        addBacon(decoratedHotDog);
    }

    private void addBacon(HotDog decoratedHotDog) {
        System.out.print(" - Bacon");
    }
}
