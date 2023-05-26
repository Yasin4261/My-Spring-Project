package com.example.demo.dto;

import com.example.demo.entities.PhoneNumber;
import org.springframework.stereotype.Component;

@Component
public class PhoneNumberDtoConverter {

    public PhoneNumberDto convert(PhoneNumber phoneNumber) {

        return new PhoneNumberDto(phoneNumber.getId(), phoneNumber.getName(), phoneNumber.getNumber());

    }

}
