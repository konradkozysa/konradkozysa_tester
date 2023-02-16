public class LeapYear {
    public static void main(String[] args) {
        int year = 2000;
        String leapYear = "Przestepny";
        String noLeapYear = "NIE Przestepny";

        if (year%400 == 0 || year%100 != 0 && year%4 == 0) {
            System.out.println(leapYear);
        } else {
            System.out.println(noLeapYear);
        }
    }
}
