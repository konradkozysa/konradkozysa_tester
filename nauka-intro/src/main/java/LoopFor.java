public class LoopFor {
    public static int sumNumbers(int numbers[]) {
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum = sum + numbers[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] numbers = new int[] {10, 20, 30, 40};
        int result = sumNumbers(numbers);
        System.out.println(result);
    }
}
