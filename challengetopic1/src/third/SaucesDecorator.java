package third;

public class SaucesDecorator extends HotDogDecorator {

    public SaucesDecorator(HotDog decoratedHotDog) {
        super(decoratedHotDog);
    }

    @Override
    public void ingredients() {
        decoratedHotDog.ingredients();
        addSauces(decoratedHotDog);
    }

    private void addSauces(HotDog decoratedHotDog) {
        System.out.print(" - Sauces");
    }
}
