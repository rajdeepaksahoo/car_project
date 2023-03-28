package com.car.carDetails.controller;

import com.car.carDetails.entity.CarEntity;
import com.car.carDetails.service.ICarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/car")
@CrossOrigin("http://localhost:49503/")
public class CarController {
    @Autowired
    private ICarService service;
    @CrossOrigin("http://localhost:49503/")

    @PostMapping(value = "/add")
    public ResponseEntity<String> addCar(@RequestBody CarEntity car){
        service.saveCar(car);
        String body = "Added Car With Regd.no "+car.getRegn_No();
        return ResponseEntity.ok(body);
    }
    @GetMapping("/all")

    public ResponseEntity<List<CarEntity>> showAllCars(){
        List<CarEntity> list = service.getAllCars();
        return ResponseEntity.ok(list);
    }
    @GetMapping("/one/{id}")
    public ResponseEntity<CarEntity> showOneCar(@PathVariable Integer id){
        CarEntity car = service.getOneCar(id);
        return ResponseEntity.ok(car);
    }
    @CrossOrigin("http://localhost:49503/")
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deleteCar (@PathVariable Integer id){
        String body = "Deleted ";
        service.deleteCar(id);
        return ResponseEntity.ok(body);
    }
    @PutMapping("/update")

    public ResponseEntity<String> updateCar(@RequestBody CarEntity car){
        service.saveCar(car);
        String body = "Updated Id "+car.getRegn_No();
        return ResponseEntity.ok(body);
    }
}
