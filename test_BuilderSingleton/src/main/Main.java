package main;

import builder.Filter;
import builder.FilterBuilder;
import singleton.Membership;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Membership membership = Membership.getInstance();
        Membership membership2 = Membership.getInstance();

        membership.activate();
        membership2.deactivate();
        System.out.println(membership2==membership);

        new Thread(()-> {
            Membership membership3 = Membership.getInstance();
            membership3.deactivate();
            System.out.println(membership3==membership2);
        }).start();

        FilterBuilder builder = new FilterBuilder();
        Filter filter = builder.addTitle("Romeo si Julieta").addGen("Romance").addYear(2000).build();
        System.out.println(filter);

    }
}