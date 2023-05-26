package com.example.demo.entities;


import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class PhoneNumber {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(length = 100)
    private String name;

    @Column(length = 11, unique = true)
    private String number;
}
