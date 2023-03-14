public class PerDesService {
    private String imie;
    private int wiek;
    private int wzrost;

    public PerDesService(String imie, int wiek, int wzrost) {
        this.imie = imie;
        this.wiek = wiek;
        this.wzrost = wzrost;
    }

    public void personDescryption () {
        if (wiek > 30 && wzrost >160) {
            System.out.println("Uzytkownik starszy niz 30 lat i wyzszy niz 160 cm");
        } else {
            System.out.println("Uzytkownik mlodszy niz 30 lat lub nizszy niz 160 cm");
        }
    }
}
