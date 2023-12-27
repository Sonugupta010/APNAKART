package com.ApnaKart.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ApnaKart.model.Address;

public interface AddressRepository extends JpaRepository<Address, Long> {
}
