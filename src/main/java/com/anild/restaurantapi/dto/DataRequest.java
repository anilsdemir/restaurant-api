package com.anild.restaurantapi.dto;

import com.anild.restaurantapi.entity.Customer;
import com.anild.restaurantapi.entity.Restaurant;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class DataRequest {
    private Restaurant restaurant;
    private Customer customer;
}
