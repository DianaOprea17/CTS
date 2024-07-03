package ro.ase.acs.flyweight;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Timer;

public class CustomTicketFactory {
    Map<String, Ticket> map = new HashMap<>();

    public Ticket getTicket(String key)
    {
        if(!map.containsKey(key))
        {
            CustomTicket custom = new CustomTicket("Titlu", LocalDate.now(), LocalDateTime.now(), key);
            map.put(key, custom);
            System.out.println("Bilet vandut");
        }
        else{
            System.out.println("Nu mai sunt bilete");
        }
        return map.get(key);
    }
}
