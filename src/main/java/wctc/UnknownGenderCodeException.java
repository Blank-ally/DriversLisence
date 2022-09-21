package wctc;

public class UnknownGenderCodeException extends Exception{

    public UnknownGenderCodeException(char genderCode){
        /*Constructor that calls the superclass constructor with a message that the given gender code is not known.*/
        super("Gender code "+genderCode + " is not known");
    }
}
