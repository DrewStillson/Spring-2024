import java.util.ArrayList;
public class Bank {

    private ArrayList<Customer> customerList = new ArrayList<>();

    public void addCustomer(Customer customer) {
        customerList.add(customer);
    }
    public void removeCustomer(Customer customer) {
        customerList.remove(customer);
    }
    public Customer getCustomer(int pin) {
        Customer wantedCustomer = null;
        for (Customer theCustomer : customerList) {
            if (theCustomer.getPIN() == pin) {
                wantedCustomer = theCustomer;
                break;
            }
        }
        return wantedCustomer;
    }
    public void getAllCustomers() {
        for (Customer currentCustomer : customerList) {
            System.out.println(currentCustomer);
        }
    }

}
