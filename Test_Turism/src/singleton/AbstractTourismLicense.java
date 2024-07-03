package singleton;

public interface AbstractTourismLicense {
    void setLicenseNumber(String number) throws MoreThanOneException;
    String getLicenseNumber();
}
