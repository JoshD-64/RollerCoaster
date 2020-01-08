package mailinglist;

//Person class.
public class Person {

    //Private variables for name, address, phone.
    private String name;
    private String address;
    private int phone;

    //Constructor
    public Person(String NAME, String ADDRESS, int PHONE) {

        //recieves input from the customer class and sets it to the variables.
        name = NAME;
        address = ADDRESS;
        phone = PHONE;
    }

    //returns name varible.
    public String getName() {
        return name;
    }

    //returns address varible.
    public String getAddress() {
        return address;
    }

    //returns phone variable.
    public int getPhone() {
        return phone;
    }
}
