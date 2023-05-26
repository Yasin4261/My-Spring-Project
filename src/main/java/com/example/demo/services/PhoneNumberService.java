package com.example.demo.services;

import com.example.demo.entities.PhoneNumber;
import com.example.demo.repositories.PhoneNumberRepository;
import org.springframework.stereotype.Service;

import java.util.LinkedHashMap;
import java.util.Map;

@Service
public class PhoneNumberService {
    final PhoneNumberRepository phoneNumberRepository;

    public PhoneNumberService(PhoneNumberRepository phoneNumberRepository) {

        this.phoneNumberRepository = phoneNumberRepository;

    }

    public Map list() {

        Map<String, Object> numbers = new LinkedHashMap<>();

        PhoneNumber pn = new PhoneNumber();
        pn.setId(1);
        pn.setName("Hasan");
        pn.setNumber("1234567890");

        numbers.put("statues", true);
        numbers.put("result", pn);
        numbers.put("message", "");

        return numbers;

    }

}
