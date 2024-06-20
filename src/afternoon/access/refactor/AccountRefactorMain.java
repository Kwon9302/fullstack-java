package afternoon.access.refactor;

public class AccountRefactorMain {
    public static void main(String[] args) {
        AccountRefactor account = new AccountRefactor("국민은행", "골드", "거농횬", 10000000);

        System.out.println(account.bank);

        System.out.println(account.grade);
    }
}
