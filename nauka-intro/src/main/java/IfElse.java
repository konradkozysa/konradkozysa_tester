public class IfElse {
    public static void main(String[] args) {
        /*int age = 65;
        String below18 = "Nie mozesz pracowac, jestes za mlody";
        String under18below65 = "Mozesz pracowac";
        String under65 = "Jestes za stary na prace";

        if (age < 18) {
            System.out.println(below18);
        } else if (age >= 18 && age < 65) {
            System.out.println(under18below65);
        } else {
            System.out.println(under65);
        }*/

        char operation = 'a';
        int a = 10;
        int b = 5;

        if (operation == '+') {
            int display = sum(a, b);
            System.out.println(display);
        } else if (operation == '-') {
            int display = sub(a, b);
            System.out.println(display);
        } else {
            error();
        }
    }

    public static int sum(int a, int b) {
        int result = a + b;
        return result;
    }

    public static int sub(int a, int b) {
        int result = a - b;
        return result;
    }

    public static void error() {
        System.out.println("Zla operacja!");
    }
}
