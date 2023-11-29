package ec.edu.epn.calculator;

public class CalculatorExecuter {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        System.out.println("<========== CALCULATOR ==========>");
        System.out.println("add(3 + 4) -> " + calculator.add(3, 4));
        System.out.println("subtract(15 - 4) -> " + calculator.subtract(15, 4));
        System.out.println("multiplication(12 * 3) -> " + calculator.multiplication(12, 3));
        System.out.println("division(100 / 20) -> " + calculator.division(100, 20));
        System.out.println("ANS -> " + calculator.getLastResult());

        System.out.println("\nMetodologías Ágiles - 2023B");
        System.out.println("Grupo 2: Charro, Colcha, De La Cruz, Mendieta");
    }
}
