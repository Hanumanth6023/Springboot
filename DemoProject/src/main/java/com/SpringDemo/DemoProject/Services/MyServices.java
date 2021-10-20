package com.SpringDemo.DemoProject.Services;

import java.util.ArrayList;
import java.util.List;

public class MyServices implements MyServicesInterface{

    List<Car> list=new ArrayList<Car>();


    public MyServices(){
        list.add(new Car(1,"Sujiki","this is Sujiki Car"));
        list.add(new Car(2,"Mahindra","This is Mahindra"));
    }

    @Override
    public List<Car> getCars() {  //get all books from the library
        return list;
    }

    @Override
    public Car addCar(Car cars) {
        this.list.add(cars);
        return cars;
    }

    @Override
    public Car getById(int id) {

        for(Car cars:this.list){
            if(cars.getId()==id){
                return cars;
            }
        }
        return null;

    }
}