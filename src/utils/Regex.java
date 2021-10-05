package utils;

public class Regex {
    public static boolean checkNumberId(String name) throws InvalidFormatException {
        String ID_REGEX = "^SV(VL|HO|RO)\\d{4}$";
        boolean b = name.matches(ID_REGEX);
        if (!b) {
            throw new InvalidFormatException("Error wrong request format");
        }
        return b;
    }

    public static boolean checkNameService(String name) throws InvalidFormatException {
        String NAME_SERVICE_REGEX = "^[A-Z]\\w+\\s?((\\w+)\\s)*([a-z]*)$";
        boolean b = name.matches(NAME_SERVICE_REGEX);
        if (!b) {
            throw new InvalidFormatException("Error wrong request format");
        }
        return b;
    }

    public static boolean checkArea(double area) throws InvalidFormatException {
        if (area > 30) {
            return true;
        } else {
            throw new InvalidFormatException("Error wrong request format");
        }
    }

    public static boolean checkPerson(int person) throws InvalidFormatException {
        if (person > 0 && person < 20) {
            return true;
        } else {
            throw new InvalidFormatException("Error wrong request format");
        }
    }

    public static boolean checkFloor(int floor) throws InvalidFormatException {
        if (floor > 0) {
            return true;
        } else {
            throw new InvalidFormatException("Error wrong request format");
        }
    }

    public static boolean checkRentalFee(double costRent) throws InvalidFormatException {
        if (costRent > 0) {
            return true;
        } else {
            throw new InvalidFormatException("Error wrong request format");
        }
    }
}