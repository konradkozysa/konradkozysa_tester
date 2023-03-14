public class UserApp {
    public static void main(String[] args) {
        User user = new User();
        for (int i = 0; i < 5; i++) {
            String nUser = "user" + i;
        }
        user.imieIn();
        user.nazwiskoIn();
        user.wiekIn();
        user.showUser();
    }
}
