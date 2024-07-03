package ro.ase.acs.strategy;

public class MobilityY implements Subscription{
    @Override
    public float totalCosts(int durationInMonths) {
        return durationInMonths*20;
    }
}
