package models.facility;

public class Facility {
    private String IdFacility;
    private String service;
    private double areaUsing;
    private double rentalFee;
    private int numberOfPeople;
    private String rentalType;
    public Facility(){

    }

    public Facility(String idFacility, String service, double areaUsing, double rentalFee, int numberOfPeople, String rentalType) {
        IdFacility = idFacility;
        this.service = service;
        this.areaUsing = areaUsing;
        this.rentalFee = rentalFee;
        this.numberOfPeople = numberOfPeople;
        this.rentalType = rentalType;
    }

    public String getIdFacility() {
        return IdFacility;
    }

    public void setIdFacility(String idFacility) {
        IdFacility = idFacility;
    }

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }

    public double getAreaUsing() {
        return areaUsing;
    }

    public void setAreaUsing(double areaUsing) {
        this.areaUsing = areaUsing;
    }

    public double getRentalFee() {
        return rentalFee;
    }

    public void setRentalFee(double rentalFee) {
        this.rentalFee = rentalFee;
    }

    public int getNumberOfPeople() {
        return numberOfPeople;
    }

    public void setNumberOfPeople(int numberOfPeople) {
        this.numberOfPeople = numberOfPeople;
    }

    public String getRentalType() {
        return rentalType;
    }

    public void setRentalType(String rentalType) {
        this.rentalType = rentalType;
    }

    @Override
    public String toString() {
        return "Facility{" +
                "service='" + service + '\'' +
                ", areaUsing=" + areaUsing +
                ", rentalFee=" + rentalFee +
                ", numberOfPeople=" + numberOfPeople +
                ", rentalType='" + rentalType + '\'' +
                '}';
    }
}
