package models.facility;

public class Villa extends Facility{
    private String standardOfRoom;
    private double poolSize;
    private int numberOfFloor;
    public Villa(){

    }

    public Villa(String standardOfRoom, double poolSize, int numberOfFloor) {
        this.standardOfRoom = standardOfRoom;
        this.poolSize = poolSize;
        this.numberOfFloor = numberOfFloor;
    }

    public Villa(String idFacility, String service, double areaUsing, double rentalFee, int numberOfPeople, String rentalType, String standardOfRoom, double poolSize, int numberOfFloor) {
        super(idFacility, service, areaUsing, rentalFee, numberOfPeople, rentalType);
        this.standardOfRoom = standardOfRoom;
        this.poolSize = poolSize;
        this.numberOfFloor = numberOfFloor;
    }

    public String getStandardOfRoom() {
        return standardOfRoom;
    }

    public void setStandardOfRoom(String standardOfRoom) {
        this.standardOfRoom = standardOfRoom;
    }

    public double getPoolSize() {
        return poolSize;
    }

    public void setPoolSize(double poolSize) {
        this.poolSize = poolSize;
    }

    public int getNumberOfFloor() {
        return numberOfFloor;
    }

    public void setNumberOfFloor(int numberOfFloor) {
        this.numberOfFloor = numberOfFloor;
    }

    @Override
    public String toString() {
        return "Villa{" +
                "IdFacility='" + getIdFacility() + '\'' +
                "service='" + getService() +
                ", areaUsing=" + getAreaUsing() +
                ", rentalFee=" + getRentalFee() +
                ", numberOfPeople=" + getNumberOfPeople() +
                ", rentalType='" + getRentalType() +
                "standardOfRoom='" + standardOfRoom + '\'' +
                ", poolSize=" + poolSize +
                ", numberOfFloor=" + numberOfFloor +
                '}';
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        Villa villa = (Villa) obj;
        return this.getIdFacility().equals(((Villa) obj).getIdFacility())
                && this.getService().equals(((Villa) obj).getService());
    }
}
