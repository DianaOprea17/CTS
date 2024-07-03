package ro.ase.acs.main;

import ro.ase.acs.chain.AirportHandler;
import ro.ase.acs.chain.CheckIn;
import ro.ase.acs.chain.FlightAttendant;
import ro.ase.acs.command.*;
import ro.ase.acs.strategy.Calculator;
import ro.ase.acs.strategy.Operation;
import ro.ase.acs.strategy.SumOperation;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        FlightAttendant flightAttendant = new FlightAttendant();
        CheckIn checked = new CheckIn();
        checked.setNextHandler(flightAttendant);
        checked.setWeight(10);
        flightAttendant.setSeatCorrect("3D");
        try {
            checked.verify();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        // flightAttendant.verify();

        System.out.println("\n----------command--------\n");

        TaxiDriver driver = new TaxiDriver();
        TaxiOrdering operator = new TaxiOrdering();
        TaxiOrder airport = new AirportTransfering(driver);
        TaxiOrder outside = new OutsideOfCity(driver);

        operator.addOrder(airport);
        operator.addOrder(outside);
        operator.contactDriver();

        System.out.println("\n----------strategy--------\n");

        Calculator calculator = new Calculator();
        Operation sum = new SumOperation();
        calculator.setOperation(sum);
        System.out.println(calculator.compute(1,2,3,4));

    }
}