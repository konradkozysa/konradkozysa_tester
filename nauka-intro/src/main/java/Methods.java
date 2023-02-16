public class Methods {
    public static int sum(int a, int b) {
        int result = a + b;
        return result;
    }

    public static void sumAndDisplay(int a, int b) {
        int result = a + b;
        System.out.println(result);
    }

    public static void main(String[] args) {
        int firstNumber = 1;
        int secondNumber = 2;
        int calculteSum = sum(firstNumber, secondNumber);
        System.out.println(calculteSum);
        sumAndDisplay(firstNumber, secondNumber);
    }
}
