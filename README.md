# Java
Practice code by myself
# Calculator Java Project

This is a Java project that implements a `Calculator` class with a `findAverage` method.
 The `findAverage` method calculates the average of three numbers and returns the result rounded to two decimal digits.
## Usage

To use the `Calculator` class, follow these steps:

1. Create an instance of the `Calculator` class.
2. Call the `findAverage` method with three numbers as arguments.
3. The method will return the average rounded to two decimal digits.

## Sample Input and Output
1. `double` num1 = 65;
2. `double` num2 = 175;
3. `double` num3 = num1 / num2;
4. System.out.println(Math.round(num3 * 100.0) / 100.0);
    
```java
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
