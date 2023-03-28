package com.car.carDetails.service;

import com.car.carDetails.entity.CarEntity;
import com.car.carDetails.repository.ICarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CarServiceImplimentor implements ICarService{
    @Autowired
    ICarRepository repo;
    @Override
    public Integer saveCar(CarEntity car) {
        car=repo.save(car);
        return car.getRegn_No();
    }

    @Override
    public void updateCar(CarEntity car) {
        car = repo.save(car);
    }

    @Override
    public void deleteCar(Integer id) {
        repo.deleteById(id);
    }

    @Override
    public CarEntity getOneCar(Integer id) {
        Optional<CarEntity> opt = repo.findById(id);
        if(opt.isPresent()){
            return opt.get();
        }
        return null;
    }

    @Override
    public List<CarEntity> getAllCars() {
        List<CarEntity> list = repo.findAll();
        return list;
    }
}
