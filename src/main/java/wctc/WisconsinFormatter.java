package wctc;

public class WisconsinFormatter implements DriverLicenseFormatter {
    @Override
    public String formatLicenseNumber(DriversLicense driversLicense) {
        String SSSS = driversLicense. getSoundCodex();
        int FFFY = driversLicense.getFirstNameMiddleInitial();
        int YYY = driversLicense.getBirthYear()%100;
        int Y1 = YYY / 10;
        int Y2 = YYY % 10;
        int DDD = driversLicense.getBirthMonthDayGender();
        int NN = driversLicense.getOverflow();
//Change formatt
        return String.format("%s-%d%d-%d%03d-%02d", SSSS, FFFY,
                Y1, Y2, DDD,NN);

    }
}
