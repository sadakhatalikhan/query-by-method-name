package com.sb.sdjpa.crud.repository;

import com.sb.sdjpa.crud.model.CustomerModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CustomerRepository extends JpaRepository<CustomerModel, Long> {
    Optional<CustomerModel> findByCustomerEmailAddress(String emailAddress);
}
