package ro.ase.acs.adapter;

import ro.ase.acs.flyweight.Ticket;

import java.lang.annotation.Target;

public class OnlineToPrintObjectAdapter implements Ticket {

    private OnlineBooking online;

    public OnlineToPrintObjectAdapter(OnlineBooking online) {
        this.online = online;
    }

    @Override
    public String print() {
        return online.showOrderDetails();
    }
}
