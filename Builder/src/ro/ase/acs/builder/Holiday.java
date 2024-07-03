package ro.ase.acs.builder;

public class Holiday {
    private String country;
    private int numberDays;
    private float price;


    private Holiday(){}
    Holiday(String country, int numberDays, float price) {
        this.country = country;
        this.numberDays = numberDays;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Holiday{" +
                "country='" + country + '\'' +
                ", numberDays=" + numberDays +
                ", price=" + price +
                '}';
    }
}

