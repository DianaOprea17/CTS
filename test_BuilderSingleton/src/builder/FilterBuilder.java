package builder;

public class FilterBuilder {
    private String titlu;
    private String gen;
    private int year;

    public FilterBuilder addTitle(String titlu) {
        this.titlu = titlu;
        return this;
    }

    public FilterBuilder addGen(String gen) {
        this.gen = gen;
        return this;
    }

    public FilterBuilder addYear(int year) {
        this.year = year;
        return this;
    }

    public Filter build(){
        return new Filter(titlu,gen,year);
    }

}
