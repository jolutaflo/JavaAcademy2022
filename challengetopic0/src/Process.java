import java.util.concurrent.ThreadLocalRandom;

interface Process {

    int randomSize();

    int getId();

    int getSize();

    String toString();

}

class SystemProcess implements Process {

    int size;
    int id;

    public SystemProcess(int id) {

        this.size = this.randomSize();
        this.id = id;

    }

    @Override
    public int getId() {
        return this.id;
    }

    @Override
    public int getSize() {
        return this.size;
    }

    @Override
    public int randomSize() {
        return ThreadLocalRandom.current().nextInt(5, 15 + 1);
    }

    @Override
    public String toString() {
        return String.format("s" + "%03d", this.id);
    }
}

class ApplicationProcess implements Process {

    public int size;
    public int id;

    public ApplicationProcess(int id) {

        this.size = this.randomSize();
        this.id = id;

    }

    @Override
    public int getId() {
        return this.id;
    }

    @Override
    public int getSize() {
        return this.size;
    }

    @Override
    public int randomSize() {
        return ThreadLocalRandom.current().nextInt(10, 20 + 1);
    }

    @Override
    public String toString() {
        return String.format("a" + "%03d", this.id);
    }
}

class VoidProcess implements Process {


    @Override
    public int randomSize() {
        return 0;
    }

    @Override
    public int getId() {
        return 0;
    }

    @Override
    public int getSize() {
        return 0;
    }

    @Override
    public String toString() {
        return "****";
    }

}


