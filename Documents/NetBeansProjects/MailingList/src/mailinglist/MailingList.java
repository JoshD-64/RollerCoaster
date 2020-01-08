package mailinglist;

import java.util.Scanner;

public class MailingList {

    public static void main(String[] args) {

        //Calls scannner object.
        Scanner key = new Scanner(System.in);

        //variables for name, address, phone, Customer number, mail.
        String name;
        String address;
        int phone;
        int CustomerNumber;
        boolean mail;

        //Input for name.
        System.out.print("Enter customer name: ");
        name = key.next();

        //Input for address.
        System.out.print("Enter customer address: ");
        address = key.next();

        //Input for phone.
        System.out.print("Enter customer phone: ");
        phone = key.nextInt();

        //Input for customer number.
        System.out.print("Enter customer number: ");
        CustomerNumber = key.nextInt();

        //Input for mailing list.
        System.out.print("Would you like to be on our mailing list?");
        mail = key.nextBoolean();

        //Customer object passing name, address, phone, customer number, and mail.
        Customer customer = new Customer(name, address, phone, CustomerNumber, mail);

        //Output of the customer information.
        System.out.println("\nCustomer Information "
                + "\n++++++++++++++++++++"
                + "\nName: " + customer.getName()
                + "\nAddress: " + customer.getAddress()
                + "\nPhone: " + customer.getPhone()
                + "\nCustomer Number: " + customer.getCustomerNumber()
                + "\nMailing List: " + customer.getMail());

    }
}
