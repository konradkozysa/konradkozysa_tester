import java.util.Scanner;

public class Grades {
    private int[] grades;
    private int size;

    public Grades() {
        this.grades = new int[10];
        this.size = 0;
    }

    public void add() {
        int value = 0;
        if (this.size == 10) {
            return;
        }
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.println("Podaj " + (i+1) + "-ą ocenę od 1 do 6");
            value = scanner.nextInt();
            while (value < 1 || value > 6) {
                System.out.println("Nie podales liczby w przedziale od 1 do 6");
                value = scanner.nextInt();
            }
            this.grades[size] = value;
            this.size++;
        }
    }

    public void lastValue () {
        System.out.println("Ostatnia podana ocena to:");
        System.out.println(grades[this.size-1]);
    }

    public void avrValue() {
        int sum = 0;
        for (int i = 0; i < this.size; i++) {
            sum = sum + grades[i];
        }
        System.out.println("Srednia ocen to:");
        System.out.println((double)sum/size);
    }

    public void allValue () {
        System.out.println("Wszyskie oceny:");
        for (int i = 0; i < this.size; i++) {
            System.out.println((i+1) + "-a ocena: " + grades[i]);
        }
    }
}