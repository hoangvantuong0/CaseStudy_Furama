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
                "IdFacility='" + getIdFacility() + '\'' +
                ", service='" + getService() +
                ", areaUsing=" + getAreaUsing() +
                ", rentalFee=" + getRentalFee() +
                ", numberOfPeople=" + getNumberOfPeople() +
                ", rentalType='" + getRentalType() +
                ", freeService='" + freeService + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        Room room = (Room) obj;
        return this.getIdFacility().equals(((Room) obj).getIdFacility())
                && this.getFreeService().equals(((Room) obj).getFreeService());
    }
    public String getInformationRoom() {
        return getIdFacility()+ "," +getService() + "," + getAreaUsing() +"," + getRentalFee()+ "," + getNumberOfPeople() +
                ","  + getRentalType() + "," + freeService;
    }
}
