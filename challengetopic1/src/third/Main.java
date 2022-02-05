package third;

public class Main {
    public static void main(String[] args) {
        HotDog basicHotDog = new BasicHotDog();

        HotDog sauceHotDog = new SaucesDecorator(basicHotDog);

        HotDog baconSauceHotDog = new BaconDecorator(sauceHotDog);

        basicHotDog.ingredients();
        System.out.println();
        sauceHotDog.ingredients();
        System.out.println();
        baconSauceHotDog.ingredients();

    }
}
