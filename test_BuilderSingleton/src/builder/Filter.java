package builder;

public class Filter implements AbstractSearchingFilter{
    private String titlu;
    private String gen;
    private int year;

    public Filter(String titlu, String gen, int year) {
        this.titlu = titlu;
        this.gen = gen;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Filter{" +
                "titlu='" + titlu + '\'' +
                ", gen='" + gen + '\'' +
                ", year=" + year +
                '}';
    }

    @Override
    public String getTitle() {
        return null;
    }

    @Override
    public String getGenre() {
        return null;
    }

    @Override
    public String getYear() {
        return null;
    }
}
