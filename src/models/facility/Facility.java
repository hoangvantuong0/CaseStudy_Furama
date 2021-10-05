package models.facility;

public class Facility {
    private String idFacility;
    private String service;
    private double areaUsing;
    private double rentalFee;
    private int numberOfPeople;
    private String rentalType;
    public Facility(){

    }

    public Facility(String idFacility, String service, double areaUsing, double rentalFee, int numberOfPeople,
                    String rentalType) {
        this.idFacility = idFacility;
        this.service = service;
        this.areaUsing = areaUsing;
        this.rentalFee = rentalFee;
        this.numberOfPeople = numberOfPeople;
        this.rentalType = rentalType;
    }

    public String getIdFacility() {
        return idFacility;
    }

    public void setIdFacility(String idFacility) {
        this.idFacility = idFacility;
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
                "IdFacility='" + idFacility + '\'' +
                ", service='" + service + '\'' +
                ", areaUsing=" + areaUsing +
                ", rentalFee=" + rentalFee +
                ", numberOfPeople=" + numberOfPeople +
                ", rentalType='" + rentalType + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        Facility facility = (Facility) obj;
        return this.idFacility.equals(((Facility) obj).idFacility)
                && this.getService().equals(((Facility) obj).getService());
    }
    public String getInformationFacility() {
        return idFacility + "," + service + "," + areaUsing + "," + rentalFee + "," + numberOfPeople + "," + rentalType;
    }
}
