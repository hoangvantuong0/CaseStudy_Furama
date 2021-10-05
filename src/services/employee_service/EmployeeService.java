package services.employee_service;

import services.Services;

public interface EmployeeService extends Services {
    @Override
    void add();

    @Override
    void display();

    @Override
    void edit();

    @Override
    void delete();
}
