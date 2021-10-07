package models.facility;

public class House extends Facility{
    private String standardOfRoom;
    private int numberOfFloor;
    public House(){

    }

    public House(String standardOfRoom, int numberOfFloor) {
        this.standardOfRoom = standardOfRoom;
        this.numberOfFloor = numberOfFloor;
    }

    public House(String idFacility, String service, double areaUsing, double rentalFee,
                 int numberOfPeople, String rentalType, String standardOfRoom, int numberOfFloor) {
        super(idFacility, service, areaUsing, rentalFee, numberOfPeople, rentalType);
        this.standardOfRoom = standardOfRoom;
        this.numberOfFloor = numberOfFloor;
    }

    public String getStandardOfRoom() {
        return standardOfRoom;
    }

    public void setStandardOfRoom(String standardOfRoom) {
        this.standardOfRoom = standardOfRoom;
    }

    public int getNumberOfFloor() {
        return numberOfFloor;
    }

    public void setNumberOfFloor(int numberOfFloor) {
        this.numberOfFloor = numberOfFloor;
    }

    @Override
    public String toString() {
        return "House{" +
                "IdFacility='" + getIdFacility() + '\'' +
                " service='" + getService() +
                ", areaUsing= " + getAreaUsing() +
                ", rentalFee= " + getRentalFee() +
                ", numberOfPeople =" + getNumberOfPeople() +
                ", rentalType='" + getRentalType() +
                "standardOfRoom='" + standardOfRoom + '\'' +
                ", numberOfFloor=" + numberOfFloor +
                '}';
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        House house = (House) obj;
        return this.getIdFacility().equals(((House) obj).getIdFacility())
                && this.getService().equals(((House) obj).getService());
    }
    public String getInformationHouse() {
        return getIdFacility()+ "," + getService() + "," + getAreaUsing() +"," + getRentalFee()+ "," + getNumberOfPeople() +
                ","  + getRentalType() + "," + standardOfRoom + ","  + numberOfFloor;
    }
}

