package com.anild.restaurantapi.entity;

import lombok.*;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class Customer {
    @Id
    private Long c_id;
    private String name;
    private String surname;
    private String email;
    private String password;

}
