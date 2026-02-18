package org.example.ecommerce.repository;

import org.example.ecommerce.entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AddressRepository extends JpaRepository<Address, Long> {

    List<Address> findByZipCode(String zipCode);

    List<Address> findByCityIgnoreCase(String city);

    List<Address> findByStreetContainingIgnoreCase(String street);

    long countByZipCode(String zipCode);

    List<Address> findByZipCodeStartingWith(String prefix);
}