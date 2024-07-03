package ro.ase.acs.builder;

public class HolidayBuilder {

    private String country;
    private int numberDays;
    private float price;

    public HolidayBuilder addCountry(String country) {
        this.country = country;
        return this;
    }

    public HolidayBuilder addNumberDays(int numberDays) {
        this.numberDays = numberDays;
        return this;
    }

    public HolidayBuilder addPrice(float price) {
        this.price = price;
        return this;
    }

    public Holiday build(){
        return new Holiday(country,numberDays,price);
    }

}
