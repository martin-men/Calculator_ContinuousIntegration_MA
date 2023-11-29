package ec.edu.epn.calculator;

public class Calculator {
    private float lastResult = 0;

    public Calculator() {}

    public float getLastResult() {
        return lastResult;
    }

    public float add(float a, float b) {
        lastResult = a + b;
        return lastResult;
    }

    public float subtract(float a, float b) {
        lastResult = a - b;
        return lastResult;
    }

    public float multiplication(float a, float b) {
        lastResult = a * b;
        return lastResult;
    }

    @SuppressWarnings("IntegerDivisionInFloatingPointContext")
    public float division(float a, float b){
        lastResult = a / b;
        return lastResult;
    }

    public void setTimeout(long timeout) {
        try {
            Thread.sleep(timeout);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
