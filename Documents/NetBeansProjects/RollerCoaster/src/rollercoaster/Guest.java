package rollercoaster;

public class Guest {

    //number of riders.
    private int riders;

    /*
    Constructor initializes number of riders.
    @param r the number of riders.
     */
    public Guest(int r) {
        riders = r;
    }

    /*
    Copy constructor to initialize object.
    @param object2 is the object copied.
     */
    public Guest(Guest object2) {
        riders = object2.riders;
    }

    /*
    The toString method.
    @return String about guest number.
     */
    public String toString() {
        String str = "guests on rollercoaster: " + riders;
        return str;
    }
}
