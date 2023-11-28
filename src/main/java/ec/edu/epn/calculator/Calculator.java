package ec.edu.epn.calculator;

public class Calculator {
    private float lastResult;

    public Calculator() {}

    public float add(float a, float b) {
        lastResult = a + b;
        return lastResult;
    }

    public float subtract(float a, float b) {
        lastResult = a - b;
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
