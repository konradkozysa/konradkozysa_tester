public class LoopWhile {
    public static int sumNumbers(int[] numbers) {
        int sum = 0;
        int i = 0;
        while (i < numbers.length) {
            sum = sum + numbers[i];
            i++;
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] numbers = new int[] {10, 20, 30, 40};
        int result = sumNumbers(numbers);
        System.out.println(result);
    }
}
