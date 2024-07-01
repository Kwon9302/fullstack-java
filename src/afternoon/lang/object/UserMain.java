package afternoon.lang.object;

public class UserMain {
    public static void main(String[] args) {
        User user = new User("오현", "ggg");
        User user2 = new User("오현", "ggg");

        System.out.println(user == user2);
        System.out.println(user.equals(user2));
    }
}
