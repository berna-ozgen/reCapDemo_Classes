public class Main {
    public static void main(String[] args) {
        CalculatorManager calculatorManager = new CalculatorManager();
        int Say1 = 10;
        int Say2 = 20;
        System.out.println("toplam= " + calculatorManager.Add(Say1, Say2));
        System.out.println("Çıkarma= " + calculatorManager.Extraction(Say1, Say2));
        System.out.println("Çarpma= " + calculatorManager.Multiplication(Say1, Say2));
        System.out.println("Bölme= " + calculatorManager.Division(Say1, Say2));
    }
}