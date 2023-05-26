package com.example.demo.controllers;

import com.example.demo.entities.PhoneNumber;
import com.example.demo.services.PhoneNumberService;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/number")
public class PhoneNumberController {

    final PhoneNumberService phoneNumberService;

    public PhoneNumberController(PhoneNumberService phoneNumberService) {

        this.phoneNumberService = phoneNumberService;

    }

    @PostMapping
    public Map save(@RequestBody PhoneNumber phoneNumber) {

        return phoneNumberService.save(phoneNumber);

    }

    @GetMapping("/list")
    public Map list() {

        return phoneNumberService.list();

    }

}
