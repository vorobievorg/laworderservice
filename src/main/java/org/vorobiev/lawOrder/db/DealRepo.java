package org.vorobiev.lawOrder.db;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.vorobiev.lawOrder.model.Customer;
import org.vorobiev.lawOrder.model.Deal;

@Repository
public interface DealRepo extends JpaRepository<Deal,Integer> {


}