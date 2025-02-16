package com.example.itmo.extended.controllers;

import com.example.itmo.extended.model.dto.request.CarInfoRequest;
import com.example.itmo.extended.model.dto.response.CarInfoResponse;
import com.example.itmo.extended.service.CarService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cars")
@RequiredArgsConstructor
public class CarController {

    private final CarService carService;

    @GetMapping("/{id}")
    public CarInfoResponse getCar(@PathVariable Long id) {
        return carService.getCar(id);
    }

    @PostMapping
    public CarInfoResponse addCar(@RequestBody CarInfoRequest request) {
        return carService.addCar(request);
    }

    @PutMapping("/{id}")
    public CarInfoResponse updateCar(@PathVariable Long id, @RequestBody CarInfoRequest request) {
        return carService.updateCar(id, request);
    }

    @DeleteMapping("/{id}")
    public void deleteCar(@PathVariable Long id) {
        carService.deleteCar(id);
    }

    @GetMapping("/all")
    public List<CarInfoResponse> getAllCars() {
        return carService.getAllCars();
    }
    @GetMapping("/all/{userId}")
    public List<CarInfoResponse> getAllCars(@PathVariable Long userId) {
        return carService.getUserCars(userId);
    }

    @PostMapping("/linkUserAndDriver/{carId}/{userId}")
    public CarInfoResponse linkUserAndDriver(@PathVariable Long carId, @PathVariable Long userId) {
        return carService.linkCarAndDriver(carId, userId);
    }

}
