package com.example.demo.dto;

import lombok.Data;

@Data
public class PhoneNumberDto {

    private int id;
    private String name;
    private String number;

    public PhoneNumberDto(int id, String name, String number) {

        this.id = id;
        this.name = name;
        this.number = number;

    }

}
