package ro.ase.acs.decorator;

import ro.ase.acs.strategy.Subscription;

public class SubInternetRoaming extends SubDecorator{

    public SubInternetRoaming(Subscription subscription) {
        super(subscription);
    }

    public void Internet(){
        System.out.println("S-a adaugat internet roaming");
    }

    @Override
    public float totalCosts(int durationInMonths) {
        Internet();
        return super.totalCosts(durationInMonths);

    }
}
