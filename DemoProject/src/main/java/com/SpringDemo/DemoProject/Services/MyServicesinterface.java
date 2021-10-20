package com.SpringDemo.DemoProject.Services;

import java.util.List;

interface MyServicesInterface {
    public List<Car> getCars();
    public Car addCar(Car books);
    public Car getById(int id);
}
