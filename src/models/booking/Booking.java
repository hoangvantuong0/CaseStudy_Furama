package models.booking;

import models.person.Customer;

public class Booking {
    private int idBooking;
    private String startDay;
    private String endDay;
    private Customer customer;
    private String serviceName;
    private String typeOfService;

    public Booking() {
    }

    public Booking(int idBooking, String startDay, String endDay, Customer customer,
                   String serviceName, String typeOfService) {
        this.idBooking = idBooking;
        this.startDay = startDay;
        this.endDay = endDay;
        this.customer = customer;
        this.serviceName = serviceName;
        this.typeOfService = typeOfService;
    }

    public int getIdBooking() {
        return idBooking;
    }

    public void setIdBooking(int idBooking) {
        this.idBooking = idBooking;
    }

    public String getStartDay() {
        return startDay;
    }

    public void setStartDay(String startDay) {
        this.startDay = startDay;
    }

    public String getEndDay() {
        return endDay;
    }

    public void setEndDay(String endDay) {
        this.endDay = endDay;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public String getTypeOfService() {
        return typeOfService;
    }

    public void setTypeOfService(String typeOfService) {
        this.typeOfService = typeOfService;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "idBooking=" + idBooking +
                ", startDay='" + startDay + '\'' +
                ", endDay='" + endDay + '\'' +
                ", customer=" + customer +
                ", serviceName='" + serviceName + '\'' +
                ", typeOfService='" + typeOfService + '\'' +
                '}';
    }
    public String getInfoBook(){
        return this.idBooking + "," + this.startDay + "," + this.endDay + "," +
                 this.customer + "," + this.serviceName + "," + this.typeOfService;
    }
}
