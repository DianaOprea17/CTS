package ro.ase.acs.decorator;

import ro.ase.acs.strategy.Subscription;

public final class SubType implements Subscription {

    private int minuteRoaming;
    private int internetRoaming;
    private String internet5G;

    public int getMinuteRoaming() {
        return minuteRoaming;
    }

    public void setMinuteRoaming(int minuteRoaming) {
        this.minuteRoaming = minuteRoaming;
    }

    public int getInternetRoaming() {
        return internetRoaming;
    }

    public void setInternetRoaming(int internetRoaming) {
        this.internetRoaming = internetRoaming;
    }

    public String getInternet5G() {
        return internet5G;
    }

    public void setInternet5G(String internet5G) {
        this.internet5G = internet5G;
    }

    @Override
    public float totalCosts(int durationInMonths) {
        return durationInMonths*4;
    }
}
