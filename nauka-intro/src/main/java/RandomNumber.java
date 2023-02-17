import java.util.Random;

public class RandomNumber {
    public static int getContOfRandomNumber(int max) {
        Random random = new Random();
        int result = 0;
        int sum = 0;
        while (sum < max) {
            int temp = random.nextInt(10);
            sum = sum + temp;
            result++;
        }
        return result;
    }
    public static void main(String[] args) {
        int max = 50;
        int show = getContOfRandomNumber(max);
        System.out.println(show);
    }
}
