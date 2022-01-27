import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner gui = new Scanner(System.in);
        Memory m1 = new Memory();
        int processCounter = 1;
        String option = "";
        while (!option.equalsIgnoreCase("x")) {
            System.out.println("Use 'cs' to create a system process\nUse 'ca' to create an application process" +
                    "\nUse 'd + process ID' to delete it\nUse 'x' to exit");
            option = gui.nextLine();
            switch (option.charAt(0)) {

                case 'c':
                    if (option.charAt(1) == 's') {
                        try {

                            m1.addProcess(new SystemProcess(processCounter++));

                        } catch (MemoryOverflowException e) {
                            m1.printMemory();
                            System.out.println(e);
                        }
                    } else if (option.charAt(1) == 'a') {
                        try {

                            m1.addProcess(new ApplicationProcess(processCounter++));

                        } catch (MemoryOverflowException e) {
                            m1.printMemory();
                            System.out.println(e);
                        }

                    }
                case 'd':
                    char opt = option.charAt(1);
                    int id = Character.getNumericValue(opt);
                    m1.deleteProcess(id);
                    m1.printMemory();
                    System.out.println();
                    break;
            }
        }

    }
}
