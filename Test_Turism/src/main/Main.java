package main;

import builder.HolidayPackage;
import builder.HolidayPackageBuilder;
import singleton.MoreThanOneException;
import singleton.TourismLicense;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws MoreThanOneException {

        TourismLicense license = TourismLicense.getInstance();
        license.setLicenseNumber("dskf32094nj");
        System.out.println(license.getLicenseNumber());

        TourismLicense license2 = TourismLicense.getInstance();
        //license2.setLicenseNumber("kf094nj");
        System.out.println(license == license2);

        new Thread(()->{
            TourismLicense license3 = TourismLicense.getInstance();
            System.out.println(license == license3);
        }).start();

        HolidayPackageBuilder builder = new HolidayPackageBuilder();
        HolidayPackage holidayPackage = builder.addTransportType("BUS").addNights(3).addPrice(2000).build();
        System.out.println(holidayPackage);
    }
}