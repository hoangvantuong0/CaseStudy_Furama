package vehicle.motorbike;

import vehicle.InterfaceCar;
import vehicle.cars.Vehicle;

public class Motorbike extends Vehicle{
    String idMotorbike;
    String power;

    public Motorbike() {
    }

    public Motorbike(String idMotorbike, String power) {
        this.idMotorbike = idMotorbike;
        this.power = power;
    }

    public String getIdMotorbike() {
        return idMotorbike;
    }

    public void setIdMotorbike(String idMotorbike) {
        this.idMotorbike = idMotorbike;
    }

    public String getPower() {
        return power;
    }

    public void setPower(String power) {
        this.power = power;
    }

    @Override
    public String toString() {
        return "Motorbike{" +
                "idMotorbike='" + idMotorbike + '\'' +
                ", power='" + power + '\'' +
                '}';
    }
    public String getMotorbikeInfo(){
        return this.idMotorbike + "," + this.power;
    }
}
