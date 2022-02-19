import java.util.function.Consumer;
import java.util.function.Function;

public class EvaluatingE {

    public static Function<Integer, Integer> getFactorial = value -> {
        int fact = 1;
        while (value > 0) {
            fact *= value;
            value--;
        }
        return fact;
    };

    static Function<Double, Double> getSeries = value -> {
        double sum = 1;
        for (int i = 1; i < 10; i++) {
            sum += ((Math.pow(value, i)) / (double) getFactorial.apply(i));
        }
        return sum;
    };


    public static void main(String[] args) {

        System.out.printf("%.4f%n", getSeries.apply(4.0));

    }
}
