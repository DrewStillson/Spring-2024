import java.util.ArrayList;
public class Customer {

    private String firstName;
    private String lastName;
    private int pin;
    private ArrayList<Account> accountList = new ArrayList<>();

    public Customer(String first, String last, int pinNum) {
        this.firstName = first;
        this.lastName = last;
        this.pin = pinNum;
    }
    public void addAccount(Account account) {
        accountList.add(account);
    }
    public void removeAccount(Account account) {
        accountList.remove(account);
    }
    public Account getAccount(int accountNum) {
        Account wantedAccount = null;
        for (Account theAccount : accountList) {
            if (theAccount.getAccountNum() == accountNum) {
                wantedAccount = theAccount;
                break;
            }
        }
        return wantedAccount;
    }
    public void getAllAccounts() {
        System.out.println("\n*** Active Accounts ***");
        for (Account currentAccount : accountList) {
            System.out.println(currentAccount);
        }
    }
    @Override
    public String toString() {
        return String.format("Name: %s, %s\nPIN: %d\n", this.lastName, this.firstName, this.pin);
    }
    public int getPIN() {return this.pin;}

}
