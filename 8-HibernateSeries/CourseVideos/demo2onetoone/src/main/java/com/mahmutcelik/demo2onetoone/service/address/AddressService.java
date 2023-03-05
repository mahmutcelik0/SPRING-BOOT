package com.mahmutcelik.demo2onetoone.service.address;

import com.mahmutcelik.demo2onetoone.model.Address;

import java.util.List;

public interface AddressService {
    List<Address> getAllAddresses();

    Address getAddressById(Long id);
}
