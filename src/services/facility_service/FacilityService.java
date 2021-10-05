package services.facility_service;

import services.Services;

public interface FacilityService extends Services {

    @Override
    void add();

    @Override
    void display();

    @Override
    void delete();

    @Override
    void edit();

    void displayMaintenance();

}
