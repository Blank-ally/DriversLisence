package wctc;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.util.Date;

public class MonthDayGenderUtility {
    private final int MOD_Male = 0;
    private final int MOD_FEMALE = 500;
    private final char CODE_MALE = 'M';
    private final char CODE_FEMALE = 'F';


    public int encodeMonthDayGender(int year, int month, int day, char genderCode) throws UnknownGenderCodeException, InvalidBirthdayExecption {
   /*If the gender code does not match one of the constants, an UnknownGenderCodeException is thrown. If the year, month,
   and day of birth do not constitute a valid date
     (such as February 31st or December 47th), an InvalidBirthdayException is thrown.
Returns (month - 1) * 40 + day + genderModConstant.*/
        try {
            LocalDate birth = LocalDate.of(year, month, day);
        } catch (DateTimeException e) {
            throw new InvalidBirthdayExecption(year, month, day);
        }

        if (genderCode != CODE_MALE && genderCode != CODE_FEMALE) {
            throw new UnknownGenderCodeException(genderCode);}

          if (genderCode == CODE_MALE) {


            return (month - 1) * 40 + day + CODE_MALE;

        }
          else  return (month - 1) * 40 + day + CODE_FEMALE;


    }

}
