package builder;

import java.util.Arrays;

public class HolidayPackage implements AbstractHolidayPackage{

    private String transportType;
    private int nights;
    private String RoomType;
    private int ranking;
    private String[] activities;
    private float price;

    public HolidayPackage(String transportType, int nights, String roomType, int ranking,
                          String[] activities, float price) {
        this.transportType = transportType;
        this.nights = nights;
        RoomType = roomType;
        this.ranking = ranking;
        this.activities = activities;
        this.price = price;
    }

    @Override
    public String getTransportType() {
        return transportType;
    }

    @Override
    public int getNightsOfAccommodation() {
        return nights;
    }

    @Override
    public String getRoomType() {
        return RoomType;
    }

    @Override
    public int getHotelRanking() {
        return ranking;
    }

    @Override
    public String[] getExtraActivities() {
        return activities.clone();
    }

    @Override
    public float getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "HolidayPackage{" +
                "transportType='" + transportType + '\'' +
                ", nights=" + nights +
                ", RoomType='" + RoomType + '\'' +
                ", ranking=" + ranking +
                ", activities=" + Arrays.toString(activities) +
                ", price=" + price +
                '}';
    }
}
