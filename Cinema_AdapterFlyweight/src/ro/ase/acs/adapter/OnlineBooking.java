package ro.ase.acs.adapter;

public interface OnlineBooking {
    /*
    This method returns order's details in A4 portret printable format -
    each info in on a different line:
    Movie title: Fast and furious 9
    Date: 04.05.2022
    Time: 16:45 UTC+3
    Seat: 3F
    ...
    */
    public String showOrderDetails();
}
