import java.util.Scanner;

public class NootebookDialogs {
    static Scanner scanner = new Scanner(System.in);
    public static String getBrand() {
        System.out.println("Podaj markę:");
        String brand = scanner.nextLine().toUpperCase().trim();
        return brand;
    }

    public static int getPrice() {
        System.out.println("Podaj cene:");
        int price = scanner.nextInt();
        return price;
    }

    public static int getWeight() {
        System.out.println("Podaj wage:");
        int weight = scanner.nextInt();
        return weight;
    }

    public static int getYear() {
        System.out.println("Podaj rok produkcji:");
        int year = scanner.nextInt();
        return year;
    }

    public static String userDeclar () {
        System.out.println("Czy chcesz wpisać komputer? T/N");
        String userDeclar = scanner.nextLine().toUpperCase().trim();
        return userDeclar;
    }
}
