import java.awt.*;
import java.util.List;

public class PrintingService {
    private List<Printer> availablePrinters;

    public PrintingService(List<Printer> availablePrinters) {
        this.availablePrinters = availablePrinters;
    }

    public void printDocument(String document){

        if(document.equalsIgnoreCase("color")){
            for(Printer printer:availablePrinters){
                if(printer instanceof ColorPrinter){
                    printer.print();
                }
            }
        }
        else{
            for(Printer printer:availablePrinters){
                if(printer instanceof BWPrinter){
                    printer.print();
                }
            }
        }

    }

}
