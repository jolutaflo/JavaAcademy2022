import java.util.ArrayList;
import java.util.List;

public class PrintingMain {
    public static void main(String[] args) {

        Printer p1 = new BWPrinter();
        Printer p2 = new ColorPrinter();

        List<Printer> printerList = new ArrayList<>();

        printerList.add(p1);
        printerList.add(p2);

        PrintingService ps = new PrintingService(printerList);

        ps.printDocument("color");
        System.out.println();
        ps.printDocument("black and white");


    }
}
