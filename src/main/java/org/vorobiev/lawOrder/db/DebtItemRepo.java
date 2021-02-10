package org.vorobiev.lawOrder.db;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.vorobiev.lawOrder.model.DebtItem;


@Repository
public interface DebtItemRepo  extends JpaRepository<DebtItem,Integer> {


}
