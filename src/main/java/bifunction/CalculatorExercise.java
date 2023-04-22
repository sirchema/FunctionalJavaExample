package bifunction;

public class CalculatorExercise {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        System.out.println("The result is" + calculator.calc((x, y) -> ": " + (x * y), 60, 10));
    }
}
