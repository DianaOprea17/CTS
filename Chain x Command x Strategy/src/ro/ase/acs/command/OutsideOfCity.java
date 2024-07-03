package ro.ase.acs.command;

public class OutsideOfCity implements TaxiOrder{

    private TaxiDriver taxiDriver;

    public OutsideOfCity(TaxiDriver taxiDriver) {
        this.taxiDriver = taxiDriver;
    }

    @Override
    public void pickUpClient() {
        taxiDriver.outsideOfCity();
    }
}
