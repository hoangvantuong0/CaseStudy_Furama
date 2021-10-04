package models.facility;

public class Room extends Facility{
    private String freeService;
    public Room(){

    }

    public Room(String freeService) {
        this.freeService = freeService;
    }

    public Room(String idFacility, String service, double areaUsing, double rentalFee, int numberOfPeople, String rentalType, String freeService) {
        super(idFacility, service, areaUsing, rentalFee, numberOfPeople, rentalType);
        this.freeService = freeService;
    }

    public String getFreeService() {
        return freeService;
    }

    public void setFreeService(String freeService) {
        this.freeService = freeService;
    }

    @Override
    public String toString() {
        return "Room{" +
                "service='" + getService() +
                ", areaUsing=" + getAreaUsing() +
                ", rentalFee=" + getRentalFee() +
                ", numberOfPeople=" + getNumberOfPeople() +
                ", rentalType='" + getRentalType() +
                "freeService='" + freeService + '\'' +
                '}';
    }
}
