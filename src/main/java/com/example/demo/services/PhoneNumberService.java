package com.example.demo.services;

import com.example.demo.dto.PhoneNumberDtoConverter;
import com.example.demo.entities.PhoneNumber;
import com.example.demo.repositories.PhoneNumberRepository;
import org.springframework.stereotype.Service;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class PhoneNumberService {
    final PhoneNumberRepository phoneNumberRepository;
    final PhoneNumberDtoConverter phoneNumberDtoConverter;

    public PhoneNumberService(PhoneNumberRepository phoneNumberRepository, PhoneNumberDtoConverter phoneNumberDtoConverter) {

        this.phoneNumberRepository = phoneNumberRepository;

        this.phoneNumberDtoConverter = phoneNumberDtoConverter;
    }

    public Map save(PhoneNumber phoneNumber) {

        Map<String, Object> result = new LinkedHashMap<>();
        result.put("result", phoneNumberDtoConverter.convert(phoneNumberRepository.save(phoneNumber)));
        result.put("message", "");

        return result;

    }


    public Map list() {

        Map<String, Object> numbers = new LinkedHashMap<>();

        PhoneNumber pn = new PhoneNumber();
        pn.setId(1);
        pn.setName("Hasan");
        pn.setNumber("1234567890");

        numbers.put("statues", true);
        numbers.put("result", phoneNumberRepository.findAll().stream().map(phoneNumberDtoConverter::convert).collect(Collectors.toList()));
        numbers.put("message", "");

        return numbers;

    }

}
