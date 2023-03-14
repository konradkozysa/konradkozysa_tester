public class PerDesApp {
    public static void main(String[] args) {
        PerDesDialogs dialogs = new PerDesDialogs();
        String imie = PerDesDialogs.setImie();
        int wiek = PerDesDialogs.setWiek();
        int wzrost = PerDesDialogs.setWzrost();
        PerDesService perDesService = new PerDesService(imie, wiek, wzrost);
        System.out.println("Imie: " + imie + ", wiek:" + wiek + ", wzrost:" + wzrost);
        perDesService.personDescryption();
    }
}
