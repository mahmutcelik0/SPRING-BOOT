package com.mahmutcelik.demo2onetoone.controller;

import com.mahmutcelik.demo2onetoone.model.Address;
import com.mahmutcelik.demo2onetoone.service.address.AddressService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class AddressController {

    private final AddressService addressService;

    public AddressController(AddressService addressService) {
        this.addressService = addressService;
    }

    @GetMapping("/address")
    private List<Address> getAllAddresses(){
        return addressService.getAllAddresses();
    }

    @GetMapping("/address/{id}")
    private Address getAddressById(@PathVariable Long id){
        return addressService.getAddressById(id);
    }
}
