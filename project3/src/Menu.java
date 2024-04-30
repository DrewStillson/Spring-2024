import java.util.Scanner;
public class Menu {

    private Scanner reader = new Scanner(System.in);
    private Bank bank = new Bank();

    public void displayMenu() {
        while (true) {
            System.out.print("********** MENU **********\n\n" +
                    "Please make a selection:\n" +
                    "1) Access Account\n" +
                    "2) Open a New Account\n" +
                    "3) Close All Accounts\n" +
                    "4) Exit\n" +
                    ">> ");
            int choice = reader.nextInt();
            reader.nextLine();

            if (choice == 1) {
                System.out.print("Please enter your PIN: ");
                int pin = reader.nextInt();
                reader.nextLine();
                Customer customer = bank.getCustomer(pin);
                if (customer == null) {
                    System.out.println("Invalid PIN");
                }
                else {
                    customer.getAllAccounts();
                    System.out.print("Please enter the account number\nof the account you would like to access: ");
                    int accountNum = reader.nextInt();
                    reader.nextLine();
                    System.out.println();
                    Account account = customer.getAccount(accountNum);
                    if (account == null) {
                        System.out.println("Account Number Invalid\n");
                    }
                    else {
                        while (true) {
                            System.out.print("Please make a selection:\n" +
                                    "1) Make a deposit\n" +
                                    "2) Make a withdrawal\n" +
                                    "3) See account balance\n" +
                                    "4) Close Account\n" +
                                    "5) Exit\n" +
                                    ">> ");
                            int accountChoice = reader.nextInt();
                            reader.nextLine();
                            if (accountChoice == 1) {
                                System.out.print("Enter the amount of deposit: ");
                                double deposit = reader.nextDouble();
                                reader.nextLine();
                                account.deposit(deposit);
                            } else if (accountChoice == 2) {
                                System.out.print("Enter the amount of withdrawal: ");
                                double withdrawal = reader.nextDouble();
                                reader.nextLine();
                                account.withdraw(withdrawal);
                            } else if (accountChoice == 3) {
                                System.out.printf("Account %d balance: $%.2f\n\n", account.getAccountNum(), account.getBalance());
                            } else if (accountChoice == 4) {
                                customer.removeAccount(account);
                                System.out.printf("\nAccount number %d closed.\n\n", account.getAccountNum());
                            } else if (accountChoice == 5) {
                                System.out.println();
                                break;
                            } else {
                                System.out.println("Invalid Entry\n");
                            }
                        }
                    }
                }
            }
            else if (choice == 2) {
                System.out.print("Are you a new customer?\n" +
                        "1) Yes\n" +
                        "2) No\n");
                int customerChoice = reader.nextInt();
                reader.nextLine();
                if (customerChoice == 1) {
                    Customer newCustomer = createNewCustomer();
                    System.out.print("Please enter deposit amount: ");
                    double deposit = reader.nextDouble();
                    reader.nextLine();
                    System.out.println();
                    Account account = new Account(deposit);
                    newCustomer.addAccount(account);
                    System.out.println("New Account Opened: " + account.getAccountNum() + "\n");
                }
                else {
                    System.out.print("Please enter PIN: ");
                    int pin = reader.nextInt();
                    reader.nextLine();
                    Customer customer = bank.getCustomer(pin);
                    if (customer == null) {
                        System.out.println("Invalid PIN\n");
                    }
                    else {
                        System.out.print("Please enter deposit amount: ");
                        double deposit = reader.nextDouble();
                        reader.nextLine();
                        Account account = new Account(deposit);
                        customer.addAccount(account);
                        System.out.println("New Account Opened: " + account.getAccountNum() + "\n");
                    }
                }
            }
            else if (choice == 3) {
                System.out.print("Please enter PIN: ");
                int pin = reader.nextInt();
                reader.nextLine();
                Customer customer = bank.getCustomer(pin);
                if (customer == null) {
                    System.out.println("Invalid PIN\n");
                }
                else {
                    bank.removeCustomer(customer);
                    System.out.println("You have been removed from the bank registry.\n");
                }
            }
            else if (choice == 4) {
                System.out.println("Thank you for using BSU Banking App\n" +
                        "Goodbye. Exiting....");
                break;
            }
            else {
                System.out.println("Invalid Entry\n");
            }
        }
    }
    private Customer createNewCustomer() {
        System.out.print("Please enter your first name: ");
        String first = reader.nextLine();
        System.out.print("Please enter your last name: ");
        String last = reader.nextLine();
        System.out.print("Please enter a 4 digit PIN: ");
        int pin = reader.nextInt();
        reader.nextLine();
        Customer customer = new Customer(first, last, pin);
        bank.addCustomer(customer);
        return customer;
    }

}