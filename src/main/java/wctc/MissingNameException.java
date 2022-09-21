package wctc;

public class MissingNameException extends Exception{


    public MissingNameException(String nameType){
        /*Constructor that calls the superclass constructor with a message that the name type (e.g. "first name") may not be blank.*/
super(nameType + " may not be blank ");
    }
}
