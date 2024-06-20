package afternoon.access.refactor2;

public class BankAccount {
    private int balance;

    public BankAccount() {
        this.balance = 0;
    }

    public void deposit(int amount) {
        if (isValidAmount(amount)) {
            this.balance += amount;
            System.out.println("현재 잔고는 +"+this.balance+"원 입니다.");
        } else {
            System.out.println("유효하지않은 금액입니다.");
        }
    }
    public void withdraw(int amount) {
        if (isValidAmount(amount)) {
            if (isPosssibleWithdraw(amount)) {
            this.balance -= amount;
                System.out.println("현재 잔고는 :" + this.balance+ "입니다.");
            } else {
                System.out.println("잔고가 부족합니다. 현재잔고 : " + this.balance+ "원 입니다.");
            }
        } else {
            System.out.println("유효하지 않은 금액입니다.");

        }
    }

    public void getBalance() {
        System.out.println("현재 잔고 : " + this.balance+"입니다");
    }

    private boolean isValidAmount(int amount) {
        return amount > 0;
    }

    private boolean isPosssibleWithdraw(int amount) {
        return this.balance >= amount;
    }
}
