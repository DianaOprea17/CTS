package ro.ase.acs.flyweight;

import java.sql.Time;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class CustomTicket implements Ticket{
    private String titlu;
    private LocalDate data;
    private LocalDateTime ora;
    private String seat;

    public CustomTicket(String titlu, LocalDate data, LocalDateTime ora, String seat) {
        this.titlu = titlu;
        this.data = data;
        this.ora = ora;
        this.seat = seat;
    }


    @Override
    public String print() {
        return (titlu + ", " + seat + ", " + data + ", " + ora);
    }
}
