package wctc;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws MissingNameException, UnknownGenderCodeException, InvalidBirthdayExecption {

        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter first name >>");

        String fname = keyboard.nextLine().toUpperCase();


        // System.out.println(fname);

        Scanner keyboard1 = new Scanner(System.in);
        System.out.print("Enter middle initial >>");

        String mInitial = keyboard1.nextLine().toUpperCase();

        Scanner keyboard2 = new Scanner(System.in);
        System.out.print("Enter last name >>");

        String lname = keyboard2.nextLine();

        Scanner keyboard3 = new Scanner(System.in);
        System.out.print("Enter  your birth month >>");

        int monthOfBirth = Integer.parseInt(keyboard3.nextLine());

        Scanner keyboard4 = new Scanner(System.in);
        System.out.print("Enter enter your birth year >>");

        int yearOfBirth = Integer.parseInt(keyboard4.nextLine());


        Scanner keyboard5 = new Scanner(System.in);
        System.out.print("Enter day of birth >>");

        int dayOfBirth = Integer.parseInt(keyboard5.nextLine());

        Scanner keyboard6 = new Scanner(System.in);
        System.out.print("Enter Enter you gender code M for male or F for female >>");


        char genderCode = keyboard6.nextLine().toUpperCase().charAt(0);


        FirstNameUtility first = new FirstNameUtility();

        LastNameUtility last = new LastNameUtility();

        MonthDayGenderUtility month = new MonthDayGenderUtility();

        DriversLicense driver = new DriversLicense();

        try {
            driver.setSoundCodex(last.encodeLastName(lname));
            driver.setFirstNameMiddleInitial(first.encodeFirstName(fname, mInitial));
            driver.setBirthYear(yearOfBirth);
            driver.setBirthMonthDayGender(month.encodeMonthDayGender(yearOfBirth, monthOfBirth, dayOfBirth, genderCode));
            driver.setOverflow(0);

        } catch (MissingNameException | UnknownGenderCodeException | InvalidBirthdayExecption exception) {
            System.out.println(exception.getMessage());
        }
        FloridaFormatter florida = new FloridaFormatter();
        ;

        System.out.println("Florida: " + florida.formatLicenseNumber(driver));

        System.out.println("Wisconsin: " + new WisconsinFormatter().formatLicenseNumber(driver));

    }
}
