package ec.edu.epn.calculator;

public class CalculatorExecuter {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        System.out.println("<========== CALCULATOR ==========>");
        System.out.println("add(3 + 4) -> " + calculator.add(3, 4));
        System.out.println("subtract(15 - 4) -> " + calculator.subtract(15, 4));
        System.out.println("ANS -> " + calculator.getLastResult());
    }
}
