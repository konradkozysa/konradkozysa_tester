import java.util.Scanner;

public class PerDesDialogs {
    static Scanner scanner = new Scanner(System.in);
    public static String setImie() {
        System.out.println("Podaj imie:");
        String imie = scanner.nextLine().toUpperCase().trim();
        return imie;
    }

    public static int setWiek() {
        System.out.println("Podaj wiek:");
        int wiek = scanner.nextInt();
        return wiek;
    }

    public static int setWzrost () {
        System.out.println("Podaj wzrost:");
        int wzrost = scanner.nextInt();
        return wzrost;
    }
}
