public class RanNumAdvApp {
    public static void main(String[] args) {
        RandomNumbersAdv randomNumbersAdv = new RandomNumbersAdv();
        int sum = randomNumbersAdv.randomNumber();

        int min = randomNumbersAdv.getMax();
        int max = randomNumbersAdv.getMin();
        System.out.println(sum);
        System.out.println(min);
        System.out.println(max);
    }
}
