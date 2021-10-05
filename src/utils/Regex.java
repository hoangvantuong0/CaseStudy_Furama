package utils;

public class Regex {
    public static boolean checkNumberId(String name) throws WrongFormatException {
        String ID_REGEX = "^SV(VL|HO|RO)\\d{4}$";
        boolean b = name.matches(ID_REGEX);
        if (!b) {
            throw new WrongFormatException("Error wrong request format");
        }
        return b;
    }

    public static boolean checkNameService(String name) throws WrongFormatException {
        String NAME_SERVICE_REGEX = "^[A-Z]\\w+\\s?((\\w+)\\s)*([a-z]*)$";
        boolean b = name.matches(NAME_SERVICE_REGEX);
        if (!b) {
            throw new WrongFormatException("Error wrong request format");
        }
        return b;
    }

    public static boolean checkArea(double area) throws WrongFormatException {
        if (area > 30) {
            return true;
        } else {
            throw new WrongFormatException("Error wrong request format");
        }
    }

    public static boolean checkPerson(int person) throws WrongFormatException {
        if (person > 0 && person < 20) {
            return true;
        } else {
            throw new WrongFormatException("Error wrong request format");
        }
    }

    public static boolean checkFloor(int floor) throws WrongFormatException {
        if (floor > 0) {
            return true;
        } else {
            throw new WrongFormatException("Error wrong request format");
        }
    }

    public static boolean checkCostRent(double costRent) throws WrongFormatException {
        if (costRent > 0) {
            return true;
        } else {
            throw new WrongFormatException("Error wrong request format");
        }
    }
}