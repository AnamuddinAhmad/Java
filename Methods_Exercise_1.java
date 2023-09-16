import java.text.DecimalFormat;

class Calculator {
    DecimalFormat df = new DecimalFormat("0.00");

    public double findAverage(int number1, int number2, int number3) {
        double avg = (double) (number1 + number2 + number3) / 3;
        return Double.parseDouble(df.format(avg));
    }
}

class Tester {
    public static void main(String args[]) {
        Calculator calculator = new Calculator();
        double res = calculator.findAverage(12, 8, 15);
        System.out.println(res);
    }
}
