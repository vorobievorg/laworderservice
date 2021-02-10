package org.vorobiev.lawOrder.db;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.vorobiev.lawOrder.model.DebtItem;
import org.vorobiev.lawOrder.model.LawOrder;


@Repository
public interface LawOrderRepo extends JpaRepository<LawOrder,Integer> {


}
