package ro.ase.acs.adapter;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class OnlineSystem implements OnlineBooking{
    private String titlu;
    private LocalDate data;
    private LocalDateTime ora;
    private String seat;

    public OnlineSystem(String titlu, LocalDate data, LocalDateTime ora, String seat) {
        this.titlu = titlu;
        this.data = data;
        this.ora = ora;
        this.seat = seat;
    }

    @Override
    public String showOrderDetails() {
        return (titlu + ", " + seat + ", " + data + ", " + ora);
    }
}
