package third;

public class BasicHotDog implements HotDog {
    private String ingredients = "Bread - Sausage";

    public BasicHotDog() {
    }

    @Override
    public void ingredients() {
        System.out.print(ingredients);
    }
}
