package ro.ase.acs.command;

public class AirportTransfering implements TaxiOrder{

    private TaxiDriver taxiDriver;

    public AirportTransfering(TaxiDriver taxiDriver) {
        this.taxiDriver = taxiDriver;
    }

    @Override
    public void pickUpClient() {
        taxiDriver.airportTransport();
    }
}
