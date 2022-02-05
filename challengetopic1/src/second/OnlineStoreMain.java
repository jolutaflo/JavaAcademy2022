package second;

public class OnlineStoreMain {

    public static void main(String[] args) {
        Product p1 = new Product("iPad", 999.99);
        Product p2 = new Product("iPhone", 699.99);
        Product p3 = new Product("Macbook", 1999.99);


        User u1 = new User("JoseLuis");
        User u2 = new User("Julieth");
        User u3 = new User("David");


        p1.attach(u1);
        p1.attach(u2);
        p1.attach(u3);

        p2.attach(u1);
        p2.attach(u2);

        p3.attach(u1);




        p1.setPrice(88.88);
        System.out.println();
        p2.setPrice(77.77);
        System.out.println();
        p3.setPrice(55.55);
    }


}
