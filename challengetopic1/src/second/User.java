package second;

public class User implements Observer {

    private String name;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void update(Product p) {
        System.out.println("New update for User: " + this.getName());
        System.out.println("Product:" + p.getName() + " - New Price:" + p.getPrice());
    }
}
