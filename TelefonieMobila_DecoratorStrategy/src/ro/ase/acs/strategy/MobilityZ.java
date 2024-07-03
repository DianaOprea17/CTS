package ro.ase.acs.strategy;

public class MobilityZ implements Subscription{
    @Override
    public float totalCosts(int durationInMonths) {
        return durationInMonths*30;
    }
}
