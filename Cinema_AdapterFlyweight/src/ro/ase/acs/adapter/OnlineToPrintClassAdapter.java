package ro.ase.acs.adapter;

import ro.ase.acs.flyweight.Ticket;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class OnlineToPrintClassAdapter extends OnlineSystem implements Ticket {

    public OnlineToPrintClassAdapter(String titlu, LocalDate data, LocalDateTime ora, String seat) {
        super(titlu, data, ora, seat);
    }

    @Override
    public String print() {
        return super.showOrderDetails();
    }
}
