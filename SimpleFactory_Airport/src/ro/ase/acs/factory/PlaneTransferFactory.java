package ro.ase.acs.factory;

public class PlaneTransferFactory implements AirportTransfer{

    PlaneTransferFactory(){};
    @Override
    public float price() {
        return 100;
    }
}
