package wctc;

public class FloridaFormatter implements DriverLicenseFormatter{
    @Override
    public String formatLicenseNumber(DriversLicense driversLicense) {
        String SSSS = driversLicense. getSoundCodex();
        int FFF = driversLicense.getFirstNameMiddleInitial();
        int YY = driversLicense.getBirthYear();
        int DDD = driversLicense.getBirthMonthDayGender();
        int NN = driversLicense.getOverflow();

        return SSSS + "-" + FFF + "-" + YY + "-" + DDD + "-" +NN ;
    }
}
