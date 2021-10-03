package services.booking_service;

import services.Services;

public interface BookingService extends Services {
    @Override
    void add();

    @Override
    void display();

    @Override
    void edit();
}
