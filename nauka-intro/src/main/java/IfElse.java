public class IfElse {
    public static void main(String[] args) {
        int age = 65;
        String below18 = "Nie mozesz pracowac, jestes za mlody";
        String under18below65 = "Mozesz pracowac";
        String under65 = "Jestes za stary na prace";

        if (age < 18) {
            System.out.println(below18);
        } else if (age >= 18 && age < 65) {
            System.out.println(under18below65);
        } else {
            System.out.println(under65);
        }
    }
}
