import java.io.Serializable;

public class Customer implements Serializable, Comparable<Customer> {
    private int clientId;
    private double accountBalance;
    private String firstName;
    private String lastName;

    public Customer(int clientId, String firstName, String lastName, double accountBalance) {
        this.clientId = clientId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.accountBalance = accountBalance;
    }

    public int getClientId() {
        return clientId;
    }

    public void setClientId(int clientId) {
        this.clientId = clientId;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public int compareTo(Customer other) {

        int firstNameComparison = this.firstName.compareTo(other.firstName);
        if (firstNameComparison != 0) return firstNameComparison;

        int lastNameComparison = this.lastName.compareTo(other.lastName);
        if (lastNameComparison != 0) return lastNameComparison;

        int idComparison = Integer.compare(this.clientId, other.clientId);
        if (idComparison != 0) return idComparison;

        return Double.compare(this.accountBalance, other.accountBalance);
    }

    @Override
    public String toString() {
        return "Client[ID=" + clientId + ", Name=" + firstName + " " + lastName + ", Balance=" + accountBalance + "]";
    }
}
