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

    public House(String service, Double areaUsing, double rentalFee, int numberOfPeople, String rentalType, String standardOfRoom, int numberOfFloor) {
        super(service, areaUsing, rentalFee, numberOfPeople, rentalType);
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
                "service='" + getService() +
                ", areaUsing=" + getAreaUsing() +
                ", rentalFee=" + getRentalFee() +
                ", numberOfPeople=" + getNumberOfPeople() +
                ", rentalType='" + getRentalType() +
                "standardOfRoom='" + standardOfRoom + '\'' +
                ", numberOfFloor=" + numberOfFloor +
                '}';
    }
}
