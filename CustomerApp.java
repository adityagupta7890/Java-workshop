import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class CustomerApp {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        List<Client> clientList = new ArrayList<>();

        System.out.print("How many clients are there? ");
        int clientCount = input.nextInt();
        input.nextLine();

        for (int i = 1; i <= clientCount; i++) {
            System.out.println("Enter details for Client " + i);

            System.out.print("Client ID: ");
            int clientId = input.nextInt();
            input.nextLine();

            System.out.print("First Name: ");
            String first = input.nextLine();

            System.out.print("Last Name: ");
            String last = input.nextLine();

            System.out.print("Account Balance: ");
            double amount = input.nextDouble();
            input.nextLine();

            clientList.add(new Client(clientId, first, last, amount));
        }

        Collections.sort(clientList);

        System.out.println("\nSorted Clients:");
        for (Client c : clientList) {
            System.out.println(c);
        }

        input.close();
    }
}

class Client implements Comparable<Client> {
    private int clientId;
    private String firstName;
    private String lastName;
    private double balance;

    public Client(int clientId, String firstName, String lastName, double balance) {
        this.clientId = clientId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.balance = balance;
    }

    @Override
    public int compareTo(Client other) {
        return Integer.compare(this.clientId, other.clientId);
    }

    @Override
    public String toString() {
        return "ID: " + clientId + ", Name: " + firstName + " " + lastName + ", Balance: $" + balance;
    }
}
