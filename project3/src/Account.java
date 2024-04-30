public class Account {

    private double balance;
    private int accountNum = 1000;
    private static int numOfAccounts = 0;

    public Account(double depositAmount) {
        this.balance = depositAmount;
        this.accountNum = accountNum + numOfAccounts;
        numOfAccounts++;
    }
    public void deposit(double amountDeposit) {
        this.balance += amountDeposit;
        System.out.printf("$%.2f was deposited in your account\n", amountDeposit);
        System.out.printf("You now have a balance of $%.2f\n\n", this.balance);
    }
    public void withdraw(double amountWithdraw) {
        if (this.balance < amountWithdraw) {
            System.out.println("You have insufficient funds.\n");
        }
        else {
            this.balance -= amountWithdraw;
            System.out.printf("$%.2f was withdrawn from your account.\n", amountWithdraw);
            System.out.printf("You now have a balance of $%.2f\n\n", this.balance);
        }
    }
    @Override
    public String toString() {
        return String.format("Account Number: " + this.accountNum + "\nBalance: $%.2f\n", this.balance);
    }
    public int getAccountNum(){
        return this.accountNum;
    }
    public double getBalance() {
        return this.balance;
    }
}
