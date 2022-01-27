public class Memory {

    private Process[][] memory = new Process[20][10];

    public Memory() {

        this.fillMemory();
    }


    private void fillMemory() {
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 10; j++) {

                this.memory[i][j] = new VoidProcess();

            }
        }
    }

    void printMemory() {
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 10; j++) {

                System.out.print(this.memory[i][j] + "  ");

            }
            System.out.println();
        }
    }

    void addProcess(Process p) throws MemoryOverflowException {
        if (p.getSize() > this.getAmountFreeSpaces()) {
            throw new MemoryOverflowException("not enough memory to save process: " + p);
        }
        int amount = p.getSize();
        for (int i = 19; i >= 0; i--) {
            for (int j = 9; j >= 0; j--) {
                if (checkFreeSpace(this.memory[i][j])) {
                    if (amount > 0) {
                        this.memory[i][j] = p;
                        amount--;
                    } else {
                        break;
                    }
                }
            }
        }
    }

    int getAmountFreeSpaces() {
        int counter = 0;
        for (int i = 19; i >= 0; i--) {
            for (int j = 9; j >= 0; j--) {
                if (this.memory[i][j].toString().equals("****")) {
                    counter++;
                }
            }
        }
        return counter;
    }

    boolean checkFreeSpace(Process p) {
        return p.toString().equals("****");
    }

    void deleteProcess(int id) {
        for (int i = 19; i >= 0; i--) {
            for (int j = 9; j >= 0; j--) {
                if (this.memory[i][j].getId() == id) {
                    this.memory[i][j] = new VoidProcess();
                }
            }
        }
        this.compactMemory();
    }

    void compactMemory() {

        boolean savedFree = false;
        int iSaved = 0;
        int jSaved = 0;

        for (int i = 19; i >= 0; i--) {
            for (int j = 9; j >= 0; j--) {

                if (this.checkFreeSpace(this.memory[i][j]) && savedFree == false) {
                    iSaved = i;
                    jSaved = j;
                    savedFree = true;

                } else if (!this.checkFreeSpace(this.memory[i][j]) && savedFree == true) {

                    this.memory[iSaved][jSaved] = this.memory[i][j];
                    this.memory[i][j] = new VoidProcess();

                    this.compactMemory();

                    return;

                }
            }
        }
    }


}

