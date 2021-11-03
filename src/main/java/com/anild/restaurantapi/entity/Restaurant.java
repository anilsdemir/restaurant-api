package com.anild.restaurantapi.entity;

import lombok.*;
import org.hibernate.Hibernate;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class Restaurant {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String phoneNumber;

    @OneToMany(targetEntity = Customer.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "cr_fk", referencedColumnName = "id")
    private List<Customer> customers;

}
