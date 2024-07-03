package ro.ase.acs.strategy;

public class MobilityX implements Subscription{

    @Override
    public float totalCosts(int durationInMonths) {
        return durationInMonths*10;
    }
}
