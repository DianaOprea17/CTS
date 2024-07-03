package ro.ase.acs.strategy;

public class MobilityType {
        private Subscription subscription;

    public void setSubscription(Subscription subscription) {
        this.subscription = subscription;
    }

    public float subscription(int months){
        if(this.subscription != null)
        {
            return this.subscription.totalCosts(months);
        }
        else{
            throw new RuntimeException();
        }
    }
}
