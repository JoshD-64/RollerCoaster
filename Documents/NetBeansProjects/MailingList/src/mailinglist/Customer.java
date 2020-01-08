package mailinglist;

//Customer class inheriting from person class.
public class Customer extends Person {

    //private varibles to hold custoer number, mail.
    private int CustomerNumber;
    private boolean mail;

    //Constructor 
    public Customer(String NAME, String ADDRESS, int PHONE, int custNum, boolean MAIL) {
        
        //recieves from the parent class name, address, phone.
        super(NAME, ADDRESS, PHONE);
        
        //recieves input from the main method and sets it to the variables.
        CustomerNumber = custNum;
        mail = MAIL;
    }

    //Method returning customer's number.
    public int getCustomerNumber() {
        return CustomerNumber;
    }

    //Method return a boolean for mailing list.
    public boolean getMail() {

        if (mail == true) {
            return true;
        } else {
            return false;

        }

    }

}
