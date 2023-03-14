import java.util.Random;
import java.util.Scanner;

public class RandomNumbersAdv {
    int max;
    int min;
    int sum;

    public RandomNumbersAdv () {
        this.sum = 0;
        this.min = 0;
        this.max = 0;
    }

    public int randomNumber() {
        Random random = new Random();
        int temp;
        int maxRandom;
        int minRandom;
        int allSum;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Zakres losowania liczb od:");
        minRandom = scanner.nextInt();
        System.out.println("do:");
        maxRandom = scanner.nextInt();
        System.out.println("Liczba do osiagniecia ktorej bedziemy sumować");
        allSum = scanner.nextInt();
        System.out.println("Bedziemy losować liczby od: " + minRandom + " do: " + maxRandom + " az osiagna: " + allSum);
        min = allSum;
        System.out.println("Wylosowana liczba:");
        while (sum <= allSum) {
            temp = minRandom + random.nextInt(maxRandom - minRandom + 1);
            sum = sum + temp;
            if (min > temp) {
                min = temp;
            }
            if (max < temp) {
                max = temp;
            }
            System.out.println(temp);
        }
        System.out.println("Suma wylosowanych: ");
        return sum;
    }

    public int getMin() {
        System.out.println("Min:");
        return this.min;
    }

    public int getMax() {
        System.out.println("Max:");
        return this.max;
    }
}
