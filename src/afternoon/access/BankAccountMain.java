package afternoon.access;

import afternoon.access.refactor2.BankAccount;

public class BankAccountMain {
    public static void main(String[] args) {
        BankAccount bankaccount = new BankAccount();

        bankaccount.deposit(100);
        bankaccount.deposit(100);
        bankaccount.getBalance();
        bankaccount.deposit(-100);
        bankaccount.withdraw(100);
        bankaccount.withdraw(-100);
        bankaccount.withdraw(-30);
        bankaccount.withdraw(1000);
        bankaccount.getBalance();

    }
}
