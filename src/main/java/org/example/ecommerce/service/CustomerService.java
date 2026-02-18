package org.example.ecommerce.service;

import org.example.ecommerce.entity.Customer;

import java.util.List;
import java.util.Optional;

public interface CustomerService {

    Customer createCustomer(Customer customer);

    Optional<Customer> findByEmail(String email);

    List<Customer> findAll();

    void deleteCustomer(Long id);
}
