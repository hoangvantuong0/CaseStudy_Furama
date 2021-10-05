package models.booking;

import models.facility.Facility;
import models.person.Customer;

public class Booking {
    private int idBooking;
    private String startDay;
    private String endDay;
    private Customer customer;
    private Facility facility;
    private String typeOfService;

    public Booking(int i, String s, String s1, String s2, String s3, String s4) {
    }

    public Booking(int idBooking, String startDay, String endDay, Customer customer, Facility facility) {
        this.idBooking = idBooking;
        this.startDay = startDay;
        this.endDay = endDay;
        this.customer = customer;
        this.facility = facility;
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

    public Facility getFacility() {
        return facility;
    }

    public void setFacility(Facility facility) {
        this.facility = facility;
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
                ", facility=" + facility +
                ", typeOfService='" + typeOfService + '\'' +
                '}';
    }

    public String getInfoBooking(){
        return this.idBooking + "," + this.startDay + "," + this.endDay + "," +
                 this.customer.getId() + "," + this.facility.getService() + "," + this.typeOfService;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        Booking booking = (Booking) obj;
        return this.getIdBooking() == (booking.getIdBooking());
    }
}
