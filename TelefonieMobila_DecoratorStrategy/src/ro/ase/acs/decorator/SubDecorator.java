package ro.ase.acs.decorator;

import ro.ase.acs.strategy.Subscription;

public abstract class SubDecorator implements Subscription {

    private Subscription subscription;

    public SubDecorator(Subscription subscription) {
        this.subscription = subscription;
    }

    @Override
    public float totalCosts(int durationInMonths) {
        return subscription.totalCosts(durationInMonths);
    }
}
