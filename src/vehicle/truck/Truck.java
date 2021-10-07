package vehicle.truck;

import vehicle.cars.Vehicle;

import java.util.Scanner;

public class Truck extends Vehicle {
    String idTruck;
    int load;

    public Truck() {
    }

    public Truck(String idTruck, int load) {
        this.idTruck = idTruck;
        this.load = load;
    }

    public String getIdTruck() {
        return idTruck;
    }

    public void setIdTruck(String idTruck) {
        this.idTruck = idTruck;
    }

    public int getLoad() {
        return load;
    }

    public void setLoad(int load) {
        this.load = load;
    }

    @Override
    public String toString() {
        return "Truck{" +
                "idTruck='" + idTruck + '\'' +
                ", load=" + load +
                '}';
    }
    public String getTruckInfo(){
        return this.idTruck + "," + this.load;
    }
}

