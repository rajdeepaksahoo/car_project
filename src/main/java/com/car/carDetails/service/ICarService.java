package com.car.carDetails.service;

import com.car.carDetails.entity.CarEntity;

import java.util.List;

public interface ICarService {
    Integer saveCar(CarEntity car);

    void updateCar(CarEntity car);

    void deleteCar(Integer id);

    CarEntity getOneCar(Integer id);

    List<CarEntity> getAllCars();
}
