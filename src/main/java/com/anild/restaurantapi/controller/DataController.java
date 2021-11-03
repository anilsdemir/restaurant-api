package com.anild.restaurantapi.controller;

import com.anild.restaurantapi.dto.DataRequest;
import com.anild.restaurantapi.entity.Customer;
import com.anild.restaurantapi.entity.Restaurant;
import com.anild.restaurantapi.repository.CustomerRepository;
import com.anild.restaurantapi.repository.RestaurantRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DataController {
    private final RestaurantRepository restaurantRepository;
    private final CustomerRepository customerRepository;

    public DataController(CustomerRepository customerRepository, RestaurantRepository restaurantRepository) {
        this.customerRepository = customerRepository;
        this.restaurantRepository = restaurantRepository;
    }

    @PostMapping("/addCustomer")
    public Restaurant addCustomer(@RequestBody DataRequest request) {
        return restaurantRepository.save(request.getRestaurant());
    }

    @PostMapping("/addRestaurant")
    public Customer addRestaurant(@RequestBody DataRequest request) {
        return customerRepository.save(request.getCustomer());
    }

    @GetMapping("/findAllRestaurants")
    public List<Restaurant> findAllRestaurants() {
        return restaurantRepository.findAll();
    }

    @GetMapping("/findAllCustomers")
    public List<Customer> findAllCustomers() {
        return customerRepository.findAll();
    }
}
