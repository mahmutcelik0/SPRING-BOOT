package com.mahmutcelik.studentapiv2.repository;

import com.mahmutcelik.studentapiv2.model.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepository extends JpaRepository<Address,String> {
}
