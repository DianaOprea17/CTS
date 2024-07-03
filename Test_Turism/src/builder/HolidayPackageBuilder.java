package builder;

public class HolidayPackageBuilder {
    private String transportType;
    private int nights;
    private String RoomType;
    private int ranking;
    private String[] activities;
    private float price;

    public HolidayPackageBuilder addTransportType(String transportType) {
        this.transportType = transportType;
        return this;
    }

    public HolidayPackageBuilder addNights(int nights) {
        this.nights = nights;
        return this;
    }

    public HolidayPackageBuilder addRoomType(String roomType) {
        this.RoomType = roomType;
        return this;
    }

    public HolidayPackageBuilder addRanking(int ranking) {
        this.ranking = ranking;
        return this;
    }

    public HolidayPackageBuilder addActivities(String[] activities) {
        this.activities = activities;
        return this;
    }

    public HolidayPackageBuilder addPrice(float price) {
        this.price = price;
        return this;
    }

    public HolidayPackage build(){
        return new HolidayPackage(transportType,nights,RoomType,ranking,activities,price);
    }

}
