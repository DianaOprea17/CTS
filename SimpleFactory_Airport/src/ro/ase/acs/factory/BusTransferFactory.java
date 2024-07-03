package ro.ase.acs.factory;

public class BusTransferFactory implements AirportTransfer{

    BusTransferFactory(){};
    @Override
    public float price() {
        return 10;
    }
}
