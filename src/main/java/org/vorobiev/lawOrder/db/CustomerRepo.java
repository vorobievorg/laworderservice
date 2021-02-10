package org.vorobiev.lawOrder.db;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.vorobiev.lawOrder.model.Customer;

@Repository
public interface CustomerRepo  extends JpaRepository<Customer,Integer> {


}