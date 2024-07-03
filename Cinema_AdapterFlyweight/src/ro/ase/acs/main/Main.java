package ro.ase.acs.main;

import ro.ase.acs.adapter.OnlineBooking;
import ro.ase.acs.adapter.OnlineSystem;
import ro.ase.acs.adapter.OnlineToPrintObjectAdapter;
import ro.ase.acs.flyweight.CustomTicket;
import ro.ase.acs.flyweight.CustomTicketFactory;
import ro.ase.acs.flyweight.Ticket;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {

        CustomTicketFactory factory = new CustomTicketFactory();
        Ticket ticket = factory.getTicket("3D");
        ticket.print();
        Ticket ticket2 = factory.getTicket("3F");
        ticket2.print();
        System.out.println(ticket2.print());
        Ticket ticket3 = factory.getTicket("3F");
        ticket3.print();
        System.out.println(ticket.print());

        System.out.println("--------Cerinta2---------");
        OnlineSystem online = new OnlineSystem("untitled", LocalDate.now(), LocalDateTime.now(), "3E");
        System.out.println(online.showOrderDetails());
        ticket2 = new OnlineToPrintObjectAdapter(online);
        System.out.println(ticket2.print());
    }
}