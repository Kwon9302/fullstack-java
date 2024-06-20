package afternoon.access.refactor2;

import afternoon.access.refactor.AccountRefactor;

public class AccountRefactorOuterMain {
    public static void main(String[] args) {
        AccountRefactor account = new AccountRefactor("우리", "브론즈", "권오현", 10000);

        System.out.println(account.bank);
//        System.out.println(accoun.g);
    }
}
