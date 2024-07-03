package ro.ase.acs.main;

import ro.ase.acs.builder.Holiday;
import ro.ase.acs.builder.HolidayBuilder;
import ro.ase.acs.builder.HolidayDirector;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        HolidayBuilder builder = new HolidayBuilder();
        builder.addCountry("France").addPrice(1000).addNumberDays(3);
        Holiday holiday = builder.build();
        System.out.println(holiday);

        HolidayDirector director = new HolidayDirector();
        Holiday hol2 = director.create("Greece", 4);
        System.out.println(hol2);
    }
}