public class CalculatorManager {
    public int Add(int Say1, int Say2) {
        return Say1 + Say2;
    }

    public int Extraction(int a, int b) {
        if (a > b) {
            return a - b;
        } else {
            return b - a;
        }

    }

    public int Multiplication(int a, int b) {
        return a * b;
    }

    public int Division(int a, int b) {
        if (a > b) {
            return a / b;
        } else {
            return b / a;
        }
    }
}
