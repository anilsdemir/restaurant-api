package com.anild.restaurantapi.service;

import com.anild.restaurantapi.entity.Restaurant;
import com.anild.restaurantapi.repository.RestaurantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RestaurantService {
    private final RestaurantRepository restaurantRepository;

    @Autowired
    public RestaurantService(RestaurantRepository restaurantRepository) {
        this.restaurantRepository = restaurantRepository;
    }

    public List<Restaurant> getRestaurants() {
        return restaurantRepository.findAll();
    }

    public void addNewRestaurant(Restaurant restaurant) {
        restaurantRepository.save(restaurant);
    }
}
