package services.customer_service;

import services.Services;

public interface CustomerService extends Services {
    @Override
    void add();

    @Override
    void display();

    void edit();
}
