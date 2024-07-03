package ro.ase.acs.chain;

public class FlightAttendant extends AirportHandler{

    private String isSeatCorrect;

    public String isSeatCorrect() {
        return isSeatCorrect;
    }

    public void setSeatCorrect(String seatCorrect) {
        isSeatCorrect = seatCorrect;
    }

    public boolean isSeatCorreeeeect()
    {
        return isSeatCorrect.equals("3F");
    }


    @Override
    public void verify() throws Exception {
        if(isSeatCorreeeeect())
        {
            System.out.println("Passenger boarded");
            if(nextHandler!= null)
                nextHandler.verify();
        }
        else{
            System.out.println("Ticket not valid");
        }
    }
}
