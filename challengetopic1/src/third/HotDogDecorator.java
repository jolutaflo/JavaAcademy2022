package third;

public abstract class HotDogDecorator implements HotDog {

    protected HotDog decoratedHotDog;

    public HotDogDecorator(HotDog decoratedHotDog) {
        this.decoratedHotDog = decoratedHotDog;
    }

    public void getIngredients() {
        decoratedHotDog.ingredients();
    }
}
