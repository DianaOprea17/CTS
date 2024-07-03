package ro.ase.acs.decorator;

import ro.ase.acs.strategy.Subscription;

public class SubMinute extends SubDecorator{
    public SubMinute(Subscription subscription) {
        super(subscription);
    }

    public void minute(){
        System.out.println("S-au adaugat minute roaming");
    }

    @Override
    public float totalCosts(int durationInMonths) {
        minute();
        return super.totalCosts(durationInMonths);

    }
}
