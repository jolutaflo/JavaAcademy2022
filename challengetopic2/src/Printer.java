public interface Printer {
    void print();
}


class BWPrinter implements Printer {

    public void print() {
        System.out.println("Printing... \nWhite and Black");
    }
}

class ColorPrinter implements Printer {

    public void print() {
        System.out.println("Printing... \nColor");
    }
}