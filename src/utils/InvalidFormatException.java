package utils;


import org.omg.CORBA.UserException;

public class InvalidFormatException extends UserException {
    public InvalidFormatException() {
    }

    public InvalidFormatException(String reason) {
        super(reason);
    }
}
