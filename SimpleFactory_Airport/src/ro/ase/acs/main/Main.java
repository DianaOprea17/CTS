package ro.ase.acs.main;

import ro.ase.acs.factory.AirportTransfer;
import ro.ase.acs.factory.AirportTransferFactory;
import ro.ase.acs.factory.TransferType;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        AirportTransferFactory factory = new AirportTransferFactory();
        AirportTransfer transfer = factory.getTransferType(TransferType.BUS);
        System.out.println(transfer.price());

    }
}