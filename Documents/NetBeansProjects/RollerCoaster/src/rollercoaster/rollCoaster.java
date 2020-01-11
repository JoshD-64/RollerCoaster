package rollercoaster;

public class rollCoaster {
    //The guest.

    private Guest riders;

    /*
    Thies Constructor initializes Guest.
    @param riders A Guest object.
     */
    public rollCoaster(Guest r) {

        //Make a new Guest object passing r to the copy constructor.
        riders = new Guest(r);
    }

    /*
    guest method.
    @return to refernce a copy of the Guest object.
     */
    public Guest guest() {

        //return copy of guest.
        return new Guest(riders);

    }

    /*
    toString method.
    @return String with guest and roller coaster information.
     */
    public String toString() {

        //print out the guest information and a thank you string.
        String str = "" + riders
                + "\nThank you for riding\n";
        return str;
    }
}
