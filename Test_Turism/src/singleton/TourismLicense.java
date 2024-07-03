package singleton;

public class TourismLicense implements AbstractTourismLicense{

    private String number;
    private boolean NumberIsSet = false;
    private static TourismLicense instance = null;
    private TourismLicense(){}
    public static synchronized TourismLicense getInstance(){
        if(instance == null){
            instance = new TourismLicense();
        }
        return instance;
    }

    @Override
    public void setLicenseNumber(String number) throws MoreThanOneException {
        if(!NumberIsSet){
            this.number = number;
            this.NumberIsSet = true;

        }
        else{
            throw new MoreThanOneException();
        }

    }

    @Override
    public String getLicenseNumber() {
        return "Number license: " + number;
    }
}
