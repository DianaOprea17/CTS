package ro.ase.acs.main;

import ro.ase.acs.decorator.SubMinute;
import ro.ase.acs.decorator.SubType;
import ro.ase.acs.strategy.MobilityType;
import ro.ase.acs.strategy.MobilityX;
import ro.ase.acs.strategy.MobilityY;
import ro.ase.acs.strategy.Subscription;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        MobilityType mob = new MobilityType();
        Subscription sub = new MobilityX();
       mob.setSubscription(sub);
       System.out.println(mob.subscription(10));
       sub = new MobilityY();
        mob.setSubscription(sub);
        System.out.println(mob.subscription(10));

        System.out.println("\n------decorator-------\n");
        Subscription decorator = new SubType();
        System.out.println( decorator.totalCosts(7));
        SubMinute min = new SubMinute(decorator);
        System.out.println(min.totalCosts(3));

    }
}