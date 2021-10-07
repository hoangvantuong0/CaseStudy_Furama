package vehicle.cars;

public class Car extends Vehicle{
    String idCar;
    int seatNumber;
    String vehicleType;

    public Car() {
    }

    public Car(String idCar, int seatNumber, String vehicleType) {
        this.idCar = idCar;
        this.seatNumber = seatNumber;
        this.vehicleType = vehicleType;
    }

    public String getIdCar() {
        return idCar;
    }

    public void setIdCar(String idCar) {
        this.idCar = idCar;
    }

    public int getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(int seatNumber) {
        this.seatNumber = seatNumber;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    @Override
    public String toString() {
        return "Car{" +
                "idCar='" + idCar + '\'' +
                ", seatNumber=" + seatNumber +
                ", vehicleType='" + vehicleType + '\'' +
                '}';
    }

    public String getCarInfo(){
        return this.idCar +"," + this.seatNumber +"," + this.vehicleType;
    }
}
