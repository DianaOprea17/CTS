package ro.ase.acs.factory;

public class AirportTransferFactory {
    public AirportTransfer getTransferType(TransferType transferType){
        if(transferType == TransferType.BUS)
        {
            return new BusTransferFactory();
        }
        else if(transferType == TransferType.PLANE){
            return new PlaneTransferFactory();
        }
        else{
            return (AirportTransfer) new RuntimeException();
        }
    }
}
