package ro.ase.acs.builder;

public class HolidayDirector {
    private HolidayBuilder builder;

    public Holiday create(String country, int nrDays){
        builder = new HolidayBuilder();
        builder.addCountry(country).addNumberDays(nrDays);
        return builder.build();
    }
}
