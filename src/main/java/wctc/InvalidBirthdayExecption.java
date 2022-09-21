package wctc;

public class InvalidBirthdayExecption extends Exception{

    public InvalidBirthdayExecption(int year, int month, int day){
      /* Constructor that calls the superclass constructor with a message that the given year, month, and day are invalid.*/

        super(year + month + day + " is an invalid day");
    }
}
