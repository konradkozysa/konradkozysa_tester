import java.util.Scanner;

public class User {
    private String imie;
    private String nazwisko;
    private int wiek;
    private String[] users;

    public User() {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.wiek = wiek;
    }

    public Users() {
        this.users = new String[5];
    }

    public void imieIn() {
        Scanner scanner = new Scanner(System.in);
        imie = scanner.nextLine().toUpperCase().trim();
    }

    public void nazwiskoIn() {
        Scanner scanner = new Scanner(System.in);
        nazwisko = scanner.nextLine().toUpperCase().trim();
    }

    public void wiekIn() {
        Scanner scanner = new Scanner(System.in);
        wiek = scanner.nextInt();
    }

    public void showUser() {
        System.out.println(imie + " " + nazwisko + " " + wiek);
    }
}
