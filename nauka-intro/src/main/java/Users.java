public class Users {
    String[] users;
    int size;
    public Users() {
        this.users = new String[5];
        this.size = 0;
    }

    public void addUser() {
        User user = new User();
        user.imieIn();
        user.nazwiskoIn();
        user.wiekIn();
    }

}
