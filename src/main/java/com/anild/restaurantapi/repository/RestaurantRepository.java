package com.anild.restaurantapi.repository;

import com.anild.restaurantapi.entity.Restaurant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RestaurantRepository
        extends JpaRepository<Restaurant, Long> {
}
